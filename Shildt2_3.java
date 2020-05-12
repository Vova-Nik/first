public class Shildt2_3 {


    public void run() {
        System.out.println("Shildt Chapt 2, Task 3, \"Prime numbers 0...100\"");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) System.out.println(i +" is Prime");
        }
    }

    boolean isPrime(int toCheck) {
        int cc = toCheck / 2;
        for (int l = 2; l <= cc; l++) {
            if (toCheck % l == 0) return false;
        }
        return true;
    }
}
