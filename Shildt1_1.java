public class Shildt1_1 {

    //Gallons to liters

    double gallons, liters;

    int counter = 0;

    void displayInfo() {
        System.out.println("Shildt11");
        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.printf("%3.0f", gallons);
            System.out.printf("%s", "\tgallons is\t");
            System.out.printf("%5.3f", liters );
            System.out.printf(" %s %n", "liters.");
            counter++;
            if(counter ==10){
                System.out.println();
                counter = 0;
            }
        }
    }
}
