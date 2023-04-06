package day42_Queue;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {

        // Deque Double ended queue
        //çift taraflı kuyruk


        Deque<String> harfler=new LinkedList<>();
        harfler.add("J");
        harfler.add("K");
        System.out.println(harfler);//[J, K]

        harfler.addFirst("B"); // harflerin basına B ekle
        System.out.println(harfler); // [B, J, K]

        System.out.println(harfler.remove()); // B   =>harflerin ilk elemanını sil.sildigi elemanı doner
        System.out.println(harfler);  // [J, K]

        harfler.addFirst("T"); // T,J,K  basına T ekle
        harfler.addLast("T");//T,J,K,T  sonuna T ekle
        harfler.add("L");
        System.out.println(harfler); //T,J,K,T,L
        System.out.println(harfler.removeLastOccurrence("T"));//true  ==> son gordugun T'yi sil
        System.out.println(harfler);//[T, J, K, L]
        System.out.println(harfler.removeFirstOccurrence("R"));//false  ==>ilk gordugun R'yi sil.olmadigi icin false
        System.out.println(harfler); // [T, J, K, L]

        System.out.println(harfler.peekFirst()); // T ==> harflerin ilk elemanini goster
        System.out.println(harfler.peekLast()); // L ==> harflerin son elemanini goster
        System.out.println(harfler.hashCode()); // 3499480

        LinkedList<String> karakterler=new LinkedList<>();
        karakterler.add("*");
        karakterler.add("?");
        System.out.println(karakterler);  // [*, ?]
        karakterler.push("&"); // karakterlerin basına & ekle
        System.out.println(karakterler); // [&, *, ?]

        LinkedList<String> copy= (LinkedList<String>) karakterler.clone();
        System.out.println(copy);  // [&, *, ?]
    }
}
