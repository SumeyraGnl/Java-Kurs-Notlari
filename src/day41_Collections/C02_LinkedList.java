package day41_Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class C02_LinkedList {
    public static void main(String[] args) {

        /*
        List data turunde bir LinkedList olusturalim
         */

        List<String> harfler = new LinkedList<>();
        harfler.add("H");
        harfler.add("K");
        harfler.add("M");
        harfler.add("L");

        System.out.println(harfler);
        harfler.add("B");
        System.out.println(harfler);

        harfler.add(3,"T");
        System.out.println(harfler);

        harfler.set(3,"R");
        System.out.println(harfler);
    }
}
