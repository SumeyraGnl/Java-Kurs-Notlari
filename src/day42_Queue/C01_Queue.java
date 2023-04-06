package day42_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {

        Queue<String> harfler = new LinkedList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("A");

        System.out.println(harfler);  // [A, B, C, A]

        // 2. index'e D ekleyelim
        //Queue özelliginden dolayi her zaman sadece sona ekler

        System.out.println(harfler.remove()); // A  ======> harflerin ilk elementini harflerden sil
        System.out.println(harfler); // [B, C, A]
        harfler.remove();
        System.out.println(harfler); // [C, A]

        harfler.add("K");
        harfler.add("L");
        System.out.println(harfler);  // [C, A, K, L]

        System.out.println(harfler.element());  // C  =====>harflerin ilk elemanını gösterir.Queue bos ise exeption firlatir
        System.out.println(harfler);  // [C, A, K, L]

        System.out.println(harfler.peek()); // C =====>harflerin ilk elemanını gösterir.Queue bos ise null degerini verir
        System.out.println(harfler);  // [C, A, K, L]

        Queue<String> karakterler = new LinkedList<>();

        System.out.println(karakterler.peek()); // null
        //System.out.println(karakterler.element()); // exeption NoSuchElementException

        System.out.println(harfler.poll()); // C  ===> harflerin ilk elemanini siler
        System.out.println(harfler); // [A, K, L]
        System.out.println(karakterler.poll()); // null

        System.out.println(karakterler.offer("*")); // true
        System.out.println(karakterler); // [*]

        System.out.println(harfler.offer("*"));  // ===> harflerin sonuna * ekle
        System.out.println(harfler); // [A, K, L, *]


    }
}
