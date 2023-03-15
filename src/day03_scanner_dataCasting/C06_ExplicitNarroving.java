package day03_scanner_dataCasting;

public class C06_ExplicitNarroving {
    public static void main(String[] args) {


        double dbl=45.32;

        int in1= (int) dbl;

        System.out.println(in1);

        dbl=3987876765d;

        in1=(int)dbl;

        System.out.println(in1);

        in1=34;
        byte by=(byte)in1;
        System.out.println(in1);

        in1=130;
        by=(byte)in1;
        System.out.println(by);






    }
}
