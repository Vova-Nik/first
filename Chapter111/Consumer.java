package Chapter111;

public class Consumer implements Runnable{
    String name;
    int delay = 1000;
    Q q;
    int got = 0;
    public Consumer (Q q, int delay, String name){
        this.name = name;
        this.delay = delay;
        this.q = q;
        System.out.println(name + " Consumer started");
        new Thread(this, "Consumer") .start();
    }

    public Consumer (Q q, String name){
        this.name = name;
        this.q = q;
        System.out.println(name + " Consumer started");
        new Thread(this, "Consumer") .start();
    }

    public void run(){
        while(true){

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            q.get();
            got++;
            System.out.println(name + " Consumed " + got + "pcs");
        }
    }
}
