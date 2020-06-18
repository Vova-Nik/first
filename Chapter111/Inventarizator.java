package Chapter111;

public class Inventarizator implements Runnable {
    static boolean created = false;
    Q q;
    Thread thread;
    boolean terminate = false;


    byte state = 0; //00000000 - normal,  00000001 - performing, 00000011 - performed
    char keyPressed = ' ';

    Inventarizator(Q q) {
        if (created) {
            return;
        }
        created = true;
        this.q = q;
        thread = new Thread(this, "Inventarizator");
        thread.start();

    }

    public void run() {
        while (!terminate) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (state == 10)
                return;
        }
        System.out.println("Inventarizator terminated");
    }

    boolean perform() {

        q.serviceRequestProcessor(Q.actions.TO_INVENT, "cooolInventarizator");
        System.out.println("Inventarization!!!!!!!!!!!!!");
        System.out.println("Inventarization! There are " + q.getPiecesInStore() + "pcs in store");
        System.out.println("Inventarization! " + q.getPut() + "pcs were put");
        System.out.println("Inventarization! " + q.getGot() + "pcs  were got");
        System.out.println("Inventarization! " + q.getNotServedGetRequests() + " req. not served");

//        while (state == 2) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        return true;
    }

    boolean keyPressed(int key){
        System.out.println("Inventarization: key got. Key == " + key);
        if(key==1&&state==0) {
            perform();
            state = 3;
            return true;
        }

        if(key==2&&state==3) {
            q.serviceRequestProcessor(Q.actions.TO_WORK, "cooolInventarizator");
            state = 0;
            return true;
        }
        return true;
    }

    boolean stopYorself(){
        terminate = true;
        return true;
    }
}

