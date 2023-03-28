package day31_inheritance_super;

public class EPersonel {

    String isim = "personel isim belirtilmemis";
    String unvan = "personel unavan belirtilmemis";

    boolean izindeMi;


    public void standartMaas(){

        System.out.println("Personel asgari ucreti : " + 8500);
    }

    public void ozelSigorta(){
        System.out.println("Personelden katki payi alinarak ozel sigorta yapilir");
    }
}
