package Chapter111;

import java.util.Scanner;

public class Inventarizator implements Runnable{
    Q q;
    Inventarizator(Q q){
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

            System.out.println("Inventarization!!!!!!!!!!!!!");
            q.setToInventarization();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            q.setToWork();
        }
    }
}
