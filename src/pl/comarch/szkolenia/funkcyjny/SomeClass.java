package pl.comarch.szkolenia.funkcyjny;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SomeClass {

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        //int y = someClass.loadFromDBAndCalculate1();
        int y = someClass.loadAndCalculate(someClass::loadDataFromDB, someClass::calculateData1);
        System.out.println(y);

        y = someClass.loadAndCalculate(someClass::loadDataFromFile, someClass::calculateData3);
        System.out.println(y);

        y = someClass.loadAndCalculate(someClass::loadDataFromServer, someClass::calculateData2);
        System.out.println(y);
    }

    public int loadAndCalculate(Supplier<Integer> loader, UnaryOperator<Integer> calculator) {
        return calculator.apply(loader.get());
    }

    public int loadFromDBAndCalculate1() {
        return calculateData1(loadDataFromDB());
    }

    private int loadDataFromDB() {
        return 5;
    }

    private int loadDataFromFile() {
        return 10;
    }

    private int loadDataFromServer() {
        return 15;
    }

    private int calculateData1(int x) {
        return x * 5;
    }

    private int calculateData2(int x) {
        return x * 10;
    }

    private int calculateData3(int x) {
        return x * 15;
    }
}
