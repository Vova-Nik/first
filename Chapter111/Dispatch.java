package Chapter111;

import java.util.ArrayList;
import java.util.Scanner;

public class Dispatch {
    Q q = new Q();
    ArrayList<Consumer> consumers;
    ArrayList<Producer> producers;
    Scanner scanner;

    public Dispatch() {
        scanner = new Scanner(System.in);
        consumers = new ArrayList<>();
        producers = new ArrayList<>();
    }


    public Dispatch(Scanner scanner) {
        this.scanner = scanner;

        consumers = new ArrayList<>();
        producers = new ArrayList<>();
    }


    public void exec() {

        producers.add(new Producer(q, "Main producer"));
        producers.add(new Producer(q, "HZ producer"));


        consumers.add(new Consumer(q, 500, "Consumer 2"));
        consumers.add(new Consumer(q, "Consumer 3"));
        consumers.add(new Consumer(q, "Consumer 4"));
        consumers.add(new Consumer(q, "Consumer 5"));
        consumers.add(new Consumer(q, 3000, "Consumer 6"));
        consumers.add(new Consumer(q, "Consumer 1"));
        consumers.add(new Consumer(q, "Consumer 7"));
        consumers.add(new Consumer(q, "Consumer 8"));


        Inventarizator inv = new Inventarizator(q);
        System.out.println("dispatch1: - Ctrl-C for stop. ----------------------------------------------------------");
        block:
        while (true) {
            int key = scanner.nextInt();

            switch (key) {
                case 1:
                case 2:
                    inv.keyPressed(key);
                    break;
                case 0:
                    break block;
            }
        }

        scanner.close();

        System.out.println("dispatch2: Ctrl-C for stop. ----------------------------------------------------------");
        for (Producer t:producers
             ) {
            t.stopYorself();
        }
        for (Consumer c:consumers
        ) {
            c.stopYorself();
        }
        inv.stopYorself();
        System.out.println("dispatch2: Ctrl-C for stop. ---------------------------------------------------------- App stopped");

    }
}
