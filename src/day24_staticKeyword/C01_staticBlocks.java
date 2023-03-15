package day24_staticKeyword;

public class C01_staticBlocks {

    C01_staticBlocks(){

        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {

        System.out.println("Main method calisti");

        System.out.println("===============");

        C01_staticBlocks obj1=new C01_staticBlocks();
    }

    static {
        /*
            static block'lar class ilk calismaya basladiginda calisir
            genel olarak class icin gerekli ön ayarlamalari yapmak icin kullanilir

            birden fazla static block varsa
            yukarıdan asagi dogru sirali calisir

         */

        System.out.println("static block calisti");
    }

    static {
        System.out.println("Altdaki static block calisti");
    }
    {
        /*
        static olmayan blocklar ise obje olusturulurken
        constructor'dan once calisir
        obje icin yapilmasi gereken on ayarlamalari yapmak icin kullanilir

         */
        System.out.println("static olmayan block calisti.");
    }
}
