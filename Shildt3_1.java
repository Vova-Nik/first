public class Shildt3_1 {
    public void run() {
        System.out.println("31 Array");

        int[] month_days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"jan","feb","mar","apr", "may", "jun", "jul","aug", "sep","okt","nov","dec"};
        String toPrn;
        for(int i = 0; i < month_days.length; i++){
            toPrn = months[i] + " - " + month_days[i] + " day.";
            System.out.println(toPrn);
        }

    }
}
