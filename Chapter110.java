public class Chapter110 {

    void exec() {
        System.out.println("Chapter 110/ Threads");

        NewThread ob1 = new NewThread("First thread");
        NewThread ob2 = new NewThread("Second thread");
        NewThread ob3 = new NewThread("Third thread");

        System.out.println("First Thread is running: " + ob1.t.isAlive());
        System.out.println("Second Thread is running: " + ob1.t.isAlive());
        System.out.println("Third Thread is running: " + ob1.t.isAlive());

        try {
            System.out.println("Waiting for finishing of all threads");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted" + " interrupted exception");
        }

        System.out.println("First Thread is running: " + ob1.t.isAlive());
        System.out.println("Second Thread is running: " + ob1.t.isAlive());
        System.out.println("Third Thread is running: " + ob1.t.isAlive());

    }
}

class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted exception");
        }
        System.out.println(name + " finished");
    }
}


