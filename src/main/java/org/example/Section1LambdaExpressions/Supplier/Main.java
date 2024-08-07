package org.example.Section1LambdaExpressions.Supplier;

import java.util.function.Supplier;

public class Main {

    public static void supplier() {
        Retrievable<Integer> retrievable = () -> 77;
        System.out.println("My Retrievable functional Interface: " + retrievable.retrieve());

        Supplier<Integer> supplier = () -> 77;
        System.out.println("Supplier common: " + supplier.get());
    }
}
