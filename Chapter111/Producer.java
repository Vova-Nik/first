package Chapter111;

public class Producer implements Runnable {
    Q q;
    public Producer(Q q){
        this.q = q;
        System.out.println("Producer started");
        new Thread(this, "Producer") .start();
    }

    public void run(){

        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
               q.put(1);
        }
    }

}
