package Chapter111;

public class Dispatch {
//    public void Dispatch(){
//
//    }
    public void exec(){
        Q q = new Q ();
        new Producer (q);
        new Consumer (q, "Consumer 1");
        new Consumer (q, 500, "Consumer 2");
        new Consumer (q, "Consumer 3");
        new Consumer (q, "Consumer 4");
        new Consumer (q, "Consumer 5");
        new Consumer (q, 3000,"Consumer 6");
        new Consumer (q, "Consumer 7");
        new Consumer (q, "Consumer 8");

        new Inventarizator(q);
        System.out.println("Ctrl-C for stop.");
    }
}
