package pl.comarch.szkolenia.strumienie;

import java.util.List;

public class Zadanie1 {
    /*
    mamy liste liczb
    wylicz srednia tych liczb i wypisz
    jezeli lista jest pusta to wypisz "nie ma sredniej"
     */
    public static void main(String[] args) {
        List<Integer> list = List.of(456,2386,51,8456,15,846,561,896,615,8,1568,189,186,189,6805,543,7,635);

        /*int sum = 0;
        for(int element : list) {
            sum += element;
        }
        if(list.size() == 0) {
            System.out.println("nie ma sredniej");
        } else {
            double avr = ((double) sum) / ((double) list.size());
            System.out.println(avr);
        }*/

        list.stream()
                .mapToInt(x -> x)
                .average()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("nie ma sredniej"));
    }
}
