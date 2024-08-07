package org.example.Section1LambdaExpressions.Consumer;

public class Main {
    public static void consumer() {
        Printable<String> printable = s -> System.out.println(s);
        Printable<String> printableReference = System.out::println;
        printable.print("hello nigga");
        printableReference.print("This is my test reference");
    }
}
