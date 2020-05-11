import java.util.Scanner;

//import java.util.Scanner;
public class Shildt2_1 {

    void displayInfo() {
        System.out.println("Shildt2.1 Sound");
        System.out.println("Input a time of echo in seconds: ");

        Scanner in = new Scanner(System.in);
        double num = in.nextInt();
        final int  SOUND_VELOCITY = 331; //meters per second

        double distance = num * SOUND_VELOCITY / 2;
        System.out.printf("%s", "\tdistance is\t");
        System.out.printf("%5.2f %s", distance, "meters\n");

    }
}

