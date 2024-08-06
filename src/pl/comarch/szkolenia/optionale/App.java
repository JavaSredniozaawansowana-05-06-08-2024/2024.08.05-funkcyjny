package pl.comarch.szkolenia.optionale;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class App {
    public static void main(String[] args) {
        Supplier<Car> defaultCarSupplier = () -> new Car("default", "default", "00000");

        Optional<Car> carBox = findCar("KR55");
        if(carBox.isPresent() && carBox.get().getBrand().equals("BMW")) {
            System.out.println("Super, znalazles BMW !!!");
        }

        carBox.ifPresent(System.out::println);
        carBox.ifPresentOrElse(
                car -> System.out.println("Takie auto przyszlo: " + car),
                () -> System.out.println("Nie ma auta !!"));

        //Car c = carBox.orElseThrow(() -> new NoCarException());

        /*Car car = carBox.orElseGet(defaultCarSupplier);
        System.out.println(car);*/

        /*Car car = findCar("TAB");
        if(car == null) {
            car = new Car("default", "default", "00000");
        }
        System.out.println(car);*/
    }

    public static Optional<Car> findCar(String plate) {
        List<Car> cars = List.of(
                new Car("Audi", "A3", "KR11"),
                new Car("BMW", "4", "KR22"),
                new Car("Kia", "Ceed", "KR33"),
                new Car("Toyota", "Corolla", "KR44"),
                new Car("Honda", "Civic", "KR55")
        );

        for(Car car : cars) {
            if(car.getPlate().equals(plate)) {
                return Optional.of(car);
            }
        }

        return Optional.empty();
    }
}
