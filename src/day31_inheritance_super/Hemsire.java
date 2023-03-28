package day31_inheritance_super;

public class Hemsire extends FMuhasebe {

    String unvan = "Hemsire";

    public void standartMaas() {
        System.out.println("Hemsireler min. 10bin tl maas alir");
    }

    public void ozelSigorta() {
        System.out.println("Hemsireler aylik 300 tl katki ile ozel sigorta yaptirabilir");
    }

    public void nobetUcreti(int nobetSayisi) {
        System.out.println(nobetSayisi * 200);
    }

    public static void main(String[] args) {
        Hemsire hemsire = new Hemsire();
        hemsire.method();
    }


    public void method() {

        System.out.println(this.unvan); // hemsire (this=> bu class'daki unvan)
        System.out.println(super.unvan); // personel (super=> parent class'daki unvan)
        System.out.println(this.sgkNo);// Calisan sgk no belirtilmedi
        System.out.println(super.sgkNo); // Calisan sgk no belirtilmedi
        this.standartMaas(); // 10000
        this.fazlaMesai(3); // 600
        super.fazlaMesai(4); // 800
        this.ozelSigorta();// Hemsireler aylik 300 tl katki ile ozel sigorta yaptirabilir
        super.ozelSigorta(); // Personelden katki payi alinarak ozel sigorta yapilir

    }
}