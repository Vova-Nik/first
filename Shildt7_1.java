import java.util.Scanner;

public class Shildt7_1 {

    private long mulTwo(int mult) {
        long rezult = mult;
        if (mult > 1) {
            rezult = mulTwo(mult-1);
        }
        return rezult * mult;
    }

    public void run() {
         while(true){
            System.out.println("Give me a number (max 63, 0 to exit)");
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            if(num < 1) return;
            if (num > 63) {
                System.out.println("To large number");
                continue;
            }
            long fact = mulTwo(num);
            System.out.println(num + "! = " + fact);
        }
    }

}
