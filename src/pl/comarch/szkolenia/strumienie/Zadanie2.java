package pl.comarch.szkolenia.strumienie;

import java.util.*;

public class Zadanie2 {
    /*
    mamy liste liczb
    chcemy usunac z listy liczby < 7 oraz > 3
    chcemy usunac duplikaty
    chcemy wypisac tylko dwie pierwsze liczby w postaci "Liczba: 5"
     */
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,1,9,3,2,6,4,5,5,4,6,7,8,9);

        long startTime = System.nanoTime();

        List<Integer> newList = new ArrayList<>();
        for(int element : list) {
            if(element > 3 && element < 7 && !newList.contains(element)) {
                newList.add(element);
            }
        }

        for(int i = 0; i < 2; i++) {
            System.out.println("Liczba: " + newList.get(i));
        }

        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        long startTime2 = System.nanoTime();
        list.stream()
                .filter(x -> x > 3)
                .filter(x -> x < 7)
                .distinct()
                .limit(2)
                .forEach(i -> System.out.println("Liczba: " + i));
        long endTime2 = System.nanoTime();
        System.out.println(endTime2 - startTime2);

        String s = "abc,abc";
        System.out.println(s.toLowerCase().equals(s));
        System.out.println(s.replaceAll(",", ""));
    }
}
