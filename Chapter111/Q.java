package Chapter111;

import java.util.Scanner;

public class Q {
    int n = 0;

    int piecesInStore = 0;
    int storeVol = 5;
    boolean onInvent = false;
    int got = 0;
    int put = 0;
    int notServedGetRequests = 0;

     public enum actions {
            PUT,
            GET,
            TO_INVENT,
            TO_WORK
        }

    public int getGot() {
        return got;
    }

    public int getPut() {
        return put;
    }

    public int getPiecesInStore() {
        return piecesInStore;
    }

    public int getNotServedGetRequests() {
        return notServedGetRequests;
    }


//    synchronized int get(){
//        while(peacesInStore <= 0 || onInvent)
//            try{
//                wait();
//            }catch (InterruptedException e){
//                System.out.println("Exception" + "InterruptedException catched");
//            }
//        peacesInStore--;
//        got ++;
//        System.out.println("Received: "  + 1);
//        System.out.println("in store are: " + peacesInStore);
//        notify();
//        return n;
//    }

    synchronized boolean serviceRequestProcessor(actions serv, String user) {
         switch (serv) {
             case PUT:
                return this.put(user);
            case GET:
                return this.get(user);
            case TO_INVENT:
                return this.setToInventarization(user);
            case TO_WORK:
                return this.setToWork(user);
            default:
            return false;
        }
    }


    boolean get(String user) {
        if(onInvent)
             return false;
        if (piecesInStore < 1) {
            notServedGetRequests ++;
            return false;
        }
        piecesInStore--;
        got++;
        System.out.println("Received: " + 1);
        System.out.println("in store are: " + piecesInStore);
        return true;
    }

//    synchronized void put(){
//        while(peacesInStore >= storeVol || onInvent)
//            try {
//                wait();
//            }catch(InterruptedException e){
//                System.out.println("Exception" + "InterruptedException catched");
//            }
//        put++;
//        peacesInStore++;
//        System.out.println("in store are: " + peacesInStore);
//        notify();
//    }

    boolean put(String user) {
        if (piecesInStore > storeVol || onInvent)
            return false;
        put++;
        piecesInStore++;
        System.out.println("in store are: " + piecesInStore);
        return true;
    }

    boolean setToInventarization(String user) {
        if(!onInvent) {
            onInvent = true;
            return true;
        }
        return false;
    }

    boolean setToWork(String user) {
        if(onInvent) {
            onInvent = false;
            return true;
        }
        return false;
    }
}
