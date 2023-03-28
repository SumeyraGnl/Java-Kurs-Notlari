package day30_inheritance;

public class CToyotaCorolla extends BToyota{

    String lastik = "Lassa 205-55-15";
    String model = "Corolla";
    String yakit = "Corolla dizel,benzinli ve elektrikli olabilir";

    public void motor(){

        System.out.println("Corollo araclar Turkiye'de uretilen motor kullanir ");}

    public void uretimYeri(){
        System.out.println("Corolla araclar Turkiye'de uretilir");
    }

    public static void main(String[] args) {

        CToyotaCorolla corolla = new CToyotaCorolla();
        System.out.println(corolla.lastik);  // Corolla class'ından deger alir
        System.out.println(corolla.model);  // Corolla class'ından deger alir
        System.out.println(corolla.yakit);  // Corolla class'ından deger alir
        corolla.motor();  // Corolla class'ından deger alir
        corolla.uretimYeri();  // Corolla class'ından deger alir

        System.out.println(corolla.marka); // Toyota class'ından deger alir
        System.out.println(corolla.aku); // Toyota class'ından deger alir
        corolla.guvenlik();  // Toyota class'ından deger alir

        System.out.println(corolla.vites);  // Araba class'ından deger alir
    }
}
