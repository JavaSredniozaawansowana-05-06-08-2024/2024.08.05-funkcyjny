package pl.comarch.szkolenia.strumienie;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list = List.of(0,-5,0,7,-2,5,9,1,2,3,4,5,6,7,8,9,6,3,-1,11);

        /*list.stream()
                .filter(i -> i > 0)
                .peek(System.out::println)
                .filter(i -> i < 8)
                .peek(System.out::println)
                .map(i -> "Liczba: " + i)
                .peek(System.out::println)
                .distinct()
                .forEach(System.out::println);*/

        List<Car> cars = List.of(
                new Car("C1", "M1", 100),
                new Car("C2", "M2", 200),
                new Car("C3", "M3", 300),
                new Car("C4", "M4", 400),
                new Car("C5", "M5", 500)
        );

        cars.stream()
                .peek(car -> car.setBrand("BMW"))
                .forEach(System.out::println);

        System.out.println(cars);

        /*Stream<Car> stream = cars.stream();
        stream.forEach(System.out::println);
        cars.stream().forEach(System.out::println);*/

        Stream<Car> stream = cars.stream();
        Stream<Car> stream2 = stream.filter(car -> car.getPrice() > 100);
        Stream<Car> stream3 = stream2.limit(3);
        stream3.forEach(System.out::println);

        //stream.forEach(System.out::println);
        //stream2.forEach(System.out::println);
        //stream3.forEach(System.out::println);

        Integer sum = cars.stream()
                .map(Car::getPrice)
                .reduce(0, Integer::sum);

        System.out.println(sum);

        list.stream()
                .mapToInt(i -> i)
                .boxed()
                .forEach(System.out::println);

        list.stream()
                .mapToInt(i -> i)
                .average()
                .ifPresent(System.out::println);
    }
}
