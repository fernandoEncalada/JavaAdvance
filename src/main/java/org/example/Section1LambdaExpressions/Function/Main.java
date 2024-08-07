package org.example.Section1LambdaExpressions.Function;

import java.util.function.Function;

public class Main {

    public static void function() {
        Functionable<Integer, String> functionable = number -> "The number is: " + number;
        System.out.println(functionable.applyThis(25));

        Function<Integer, String> function = number -> "The number is: " + number;
        System.out.println(function.apply(25));
    }
}
