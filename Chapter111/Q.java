package Chapter111;

public class Q {
    int n;
    boolean valueset = false;

    synchronized int get(){
        while(!valueset)
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Exception" + "InterruptedException catched");
            }
        System.out.println("Received: " + n);
        valueset = false;
        notify();
        return n;
    }

    synchronized void put(int n){
        while(valueset)
            try {
                wait();
            }catch(InterruptedException e){
                System.out.println("Exception" + "InterruptedException catched");
            }
        this.n = n;
        valueset = true;
        System.out.println("Sent: " + n);
        notify();
    }
}
