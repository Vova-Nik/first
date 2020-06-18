package Chapter111;

public class Producer implements Runnable {
    Q q;
    Thread thread;
    boolean terminate = false;
    String name;
    int produced = 0;
    public Producer(Q q){
        this.q = q;
        System.out.println("Producer started");
        thread = new Thread(this, "Producer");
        thread.start();
    }

    public Producer(Q q, String name){
        this.q = q;
        System.out.println("Producer started");
        thread = new Thread(this, name);
        this.name = name;
        thread.start();
    }

    public void run(){

        while(!terminate){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           if( q.serviceRequestProcessor(Q.actions.PUT, "Producer #1")){
               produced ++;
               System.out.println("Produced " + produced);
           }

        }
        System.out.println("Producer Thread " + name + " terminated");
    }

    boolean stopYorself(){
        //this.thread.interrupt();
        terminate = true;
        return true;

    }

}
