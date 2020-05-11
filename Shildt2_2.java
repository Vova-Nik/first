public class Shildt2_2 {

    public void run() {
        boolean p, q;
        System.out.println("\"Logical Operations\"");

        System.out.println();

        System.out.println("p=\t\tq=\t\tp&q\t\tp|q\t\tp^q\t\t!p");
        String ress;
        p = true;
        q = true;
        ress = pr(p, q);
        System.out.println(ress);
        p = true;
        q = false;
        ress = pr(p, q);
        System.out.println(ress);
        ress = pr(false, true);
        System.out.println(ress);
        ress = pr(false, false);
        System.out.println(ress);
    }

    String pr(boolean pp, boolean qq) {
        String toPrinting = "";

        if (pp)
            toPrinting += '1';
        else
            toPrinting += '0';
        toPrinting += "\t\t";

        if (qq)
            toPrinting += '1';
        else
            toPrinting += '0';
        toPrinting += "\t\t";

        if (pp & qq)
            toPrinting += '1';
        else
            toPrinting += '0';
        toPrinting += "\t\t";

        if (pp | qq)
            toPrinting += '1';
        else
            toPrinting += '0';
        toPrinting += "\t\t";

        if (pp ^ qq)
            toPrinting += '1';
        else
            toPrinting += '0';
        toPrinting += "\t\t";

        if (!pp)
            toPrinting += '1';
        else
            toPrinting += '0';
        toPrinting += "\t\t";

        return toPrinting;
    }

//    void prl(String str){
//
//    }
}
