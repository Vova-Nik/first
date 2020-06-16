package Chapter111;

import java.util.Scanner;

public class Inventarizator implements Runnable{
    static boolean created = false;
    Q q;
    Inventarizator(Q q){
        if(created){
            return;
        }
        created = true;
        this.q = q;
        new Thread(this, "Inventarizator") .start();
    }
    public void run(){
        while(true){

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            q.setToInventarization();
            System.out.println("Inventarization!!!!!!!!!!!!!");
            System.out.println("Inventarization! There are " + q.getPeacesInStore() + "pcs in store");
            System.out.println("Inventarization! " + q.getPut() + "pcs were put");
            System.out.println("Inventarization! " + q.getGot() + "pcs  were got");

//            try {
//                Thread.sleep(4000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            System.out.println("Inventarization. Set to work");
            q.setToWork();

        }
    }
}
