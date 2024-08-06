package pl.comarch.szkolenia.funkcyjny;

import java.util.function.Function;

public class JakasMojaFunkcja implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer * 5;
    }
}
