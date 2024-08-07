package org.example.Section1LambdaExpressions.Predicate;

import org.example.Section1LambdaExpressions.Person;

import java.util.function.Predicate;

public class Main {

    public static void predicate() {
        Evaluate<Integer> evaluate = b -> b < 0;
        System.out.println(evaluate.test(-1));
        System.out.println(evaluate.test(+1));

        Predicate<Integer> predicate = p -> p < 0;
        System.out.println(predicate.test(-1));
        System.out.println(predicate.test(+1));
    }
}
