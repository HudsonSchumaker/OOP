package br.com.schumaker.hudson.oo.util;

/**
 *
 * @author Hudson Schumaker
 */
public class Tuplet<F, S, T> {
    private final F first;
    private final S second;
    private final T third;

    private Tuplet(F first, S second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    
    public static <F, S, T> Tuplet<F, S, T> of(F f, S s, T t) {
        return new Tuplet<>(f, s, t);
    }

    public F getFirst() { return first; }
    public S getSecond() { return second; }
    public T getThird() { return third; }
}
