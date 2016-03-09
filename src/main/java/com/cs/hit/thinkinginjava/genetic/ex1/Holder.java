package com.cs.hit.thinkinginjava.genetic.ex1;

public class Holder<T> {
    private T a;

    public Holder(T a) {
        this.a = a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public static void main(String[] args) {
        Holder<String> h = new Holder<String>("hello");
        System.out.println(h.getA());
    }
}
