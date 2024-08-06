package pl.comarch.szkolenia.funkcyjny;

@FunctionalInterface
public interface TriFunction<T,U,Z,X> {
    X apply(T t, U u, Z z);
}
