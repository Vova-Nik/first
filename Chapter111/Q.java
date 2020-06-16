package Chapter111;

import java.util.Scanner;

public class Q {
    int n=0;
    int peacesInStore = 0;
    int storeVol = 5;
    boolean onInvent = false;
    int got = 0;
    int put = 0;

    public int getPeacesInStore() {
        return peacesInStore;
    }

    public int getGot() {
        return got;
    }

    public int getPut() {
        return put;
    }


    synchronized int get(){
        while(peacesInStore <= 0 || onInvent)
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println("Exception" + "InterruptedException catched");
            }
        peacesInStore--;
        got ++;
        System.out.println("Received: "  + 1);
        System.out.println("in store are: " + peacesInStore);
        notify();
        return n;
    }

    synchronized void put(){
        while(peacesInStore >= storeVol || onInvent)
            try {
                wait();
            }catch(InterruptedException e){
                System.out.println("Exception" + "InterruptedException catched");
            }
        put++;
        peacesInStore++;
        System.out.println("in store are: " + peacesInStore);
        notify();
    }

    void setToInventarization(){
        onInvent =true;

//        while(onInvent) {
//            try{
//                wait();
//                System.out.println("waiting on Inventarization!");
//            }catch (InterruptedException e){
//                System.out.println("Exception" + "InterruptedException cached");
//            }
//       }
        //notify();
    }

   void setToWork(){
        onInvent = false;

    }
}
