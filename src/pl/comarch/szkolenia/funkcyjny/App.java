package pl.comarch.szkolenia.funkcyjny;

import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class App {
    public static void main(String[] args) {
        Function<Integer, String> function = i -> i + " - taka liczba przyszla !!!";

        System.out.println(function.apply(5));
        System.out.println(function.apply(6));
        System.out.println(function.apply(19));
        System.out.println(function.apply(200));
        System.out.println(function.apply(1000));

        UnaryOperator<Double> unaryOperator = x -> x*10.44;

        System.out.println(unaryOperator.apply(4.44));
        System.out.println(unaryOperator.apply(10.12));
        System.out.println(unaryOperator.apply(15.17));

        BiFunction<Integer, Double, String> biFunction = (i, d) -> i + "" + d;

        System.out.println(biFunction.apply(3, 5.67));
        System.out.println(biFunction.apply(18, 34.34));
        System.out.println(biFunction.apply(17, 956.0));
        System.out.println(biFunction.apply(2345, 234.456));

        Predicate<Car> predicate = car -> car.getPrice() > 300;

        System.out.println(predicate.test(new Car("Audi", "A3", 200)));
        System.out.println(predicate.test(new Car("BMW", "5", 400)));
        System.out.println(predicate.test(new Car("Kia", "Ceed", 100)));
        System.out.println(predicate.test(new Car("Toyota", "Corolla", 150)));

        Supplier<Car> supplier = () -> new Car("default", "default", 0);

        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        Consumer<Car> consumer = System.out::println;

        consumer.accept(new Car("Audi", "A3", 200));
        consumer.accept(supplier.get());

        Comparator<Car> comparator = Comparator.comparingInt(Car::getPrice);

        TriFunction<Integer, Integer, Double, String> triFunction = (i1, i2, d) -> i1 * i2 + "" + d;

        System.out.println(triFunction.apply(2,5,6.67));

        cos(1,2,3,4,56,7,5,324,234,2);

        List.of(12,12,23,23,34,342,234,342,34252345,234,342,342,432,342,342,432,423,34,34,43);

        UnaryOperator<Double> formatFunction = x -> {
            if(x == 0) {
                return 0.0;
            } else {
                int i = (int) (x * 100);
                double result = i / 100.0;
                return result;
            }
        };

        Function<Integer, Integer> jakasFunkcja = x -> x * 5;
        BiFunction<Integer, Integer, Integer> mojaUlepszonaFunkcja = (x,w) -> x * w;

        System.out.println(jakasFunkcja.apply(44));
        System.out.println(jakasFunkcja.apply(1));
        System.out.println(jakasFunkcja.apply(5));
    }

    public static void cos(int... x) {
        for(int element : x) {
            System.out.println(element);
        }
    }

    public static void funkcja(final int z) {
        // wczytuje dane z bazy
        List<Integer> cos;
        Function<Integer, Integer> function = x -> x * z;
    }
}
