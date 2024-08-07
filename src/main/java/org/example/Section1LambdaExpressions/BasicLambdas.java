package org.example.Section1LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.example.Section1LambdaExpressions.Consumer.Main.consumer;
import static org.example.Section1LambdaExpressions.Function.Main.function;
import static org.example.Section1LambdaExpressions.Predicate.Main.predicate;
import static org.example.Section1LambdaExpressions.Supplier.Main.supplier;

public class BasicLambdas {
    public static void main(String[] args) {
        Person mike = new Person("Mike", 33, 1.8);
        Person ann = new Person("Ann", 13, 1.4);

        System.out.println("Is Even number: " + check(4, x -> x % 2 == 0));
        System.out.println("Is Even number: " + check(7, x -> x % 2 == 0));
        System.out.println("Starts with 'Mr.': "
                + check("Mr. Joe Bloggs", text -> text.startsWith("Mr."))
        );
        System.out.println("Starts with 'Mr.': "
                + check("Ms. Ann Bloggs", text -> text.startsWith("Mr."))
        );
        System.out.println("Mike is adult? " + check(mike, m -> m.getAge() >= 18));
        System.out.println("Ann is adult? " + check(ann, m -> m.getAge() >= 18));


        consumer();
        supplier();
        predicate();
        function();

        List<Person> people = getPeople();
    }

    public static <T> boolean check(T t, Predicate<T> predicate) {
        return predicate.test(t);
    }

    private static void sortName(List<Person> people) {

    }

    private static void sortAge(List<Person> people) {

    }

    private static void sortHeight(List<Person> people) {

    }

    private static List<Person> getPeople() {
        List<Person> result = new ArrayList<>();
        result.add(new Person("Mike", 33, 1.8));
        result.add(new Person("Mary", 25, 1.4));
        result.add(new Person("Alan", 34, 1.7));
        result.add(new Person("Zoe", 30, 1.5));

        return result;
    }
}
