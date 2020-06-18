package Chapter111;

import java.util.HashMap;

public class Consumer implements Runnable{
    Thread thread;
    String name;
    int delay = 1000;
    Q q;
    int got = 0;
    boolean terminate = false;

    //HashMap<String, Consumer> iAm = new HashMap<String, Consumer>();


    public Consumer (Q q, int delay, String name){
        this.name = name;
        this.delay = delay;
        this.q = q;
        System.out.println(name + " Consumer started");
        thread = new Thread(this, name);
        thread.start();
    }

    public Consumer (Q q, String name){
        this.name = name;
        this.q = q;
        System.out.println(name + " Consumer started");
        new Thread(this, "Consumer") .start();
    }

//    public HashMap getInstance(){
//        iAm.put(name, this);
//        return iAm;
//    }


    public void run(){
        while(!terminate){

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(q.serviceRequestProcessor(Q.actions.GET, name)) {
                got++;
                System.out.println(name + " Consumed " + got + "pcs");
            }
        }
        System.out.println("Consumer Thread " + name + " terminated");
    }


    boolean stopYorself(){
        //this.thread.interrupt();
        terminate = true;
        return true;
    }
}
