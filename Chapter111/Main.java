package Chapter111;

public class Main {
    void go(){
        Q q = new Q ();
        new Producer (q);
        new Consumer (q);
    }
}
