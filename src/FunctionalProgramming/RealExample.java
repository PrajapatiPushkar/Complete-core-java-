package src.FunctionalProgramming;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class RealExample {
    public static void main(String[] args) {
        // <title> cost $<price>
        //BiFunction
        BiFunction<String, Double, String> formatter
        = (title, price) -> title + "cost $" + price;

        System.out.println(formatter.apply("Java Basics ", 599.00));
        System.out.println(formatter.apply("The Hand ", 699.00));
        System.out.println(formatter.apply("Matrix ", 799.00));
        System.out.println(formatter.apply("Advanced Java ", 999.00));

       //is Expensive
        Predicate<Double> isExpensive
                = price -> price > 500;
        System.out.println(isExpensive.test(799.00));


    }
}
