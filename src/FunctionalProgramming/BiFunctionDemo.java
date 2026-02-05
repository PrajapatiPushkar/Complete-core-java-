package src.FunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {

    public static BiFunction<Integer, Integer, Integer> addFunction
            = Integer::sum; //by lamda method references

    public static BiFunction<Integer, Integer, Integer> subtractFunction
            = (a, b) -> a - b;// normally


    public static void main(String[] args) {
        System.out.println(addFunction.apply(10, 20));
        System.out.println(subtractFunction.apply(20, 10));

        System.out.println("=================");

        Function<Integer, Integer> multiplyBy2 = X -> X * 2;
        BiFunction<Integer, Integer, Integer> combinedFunction
                = addFunction.andThen(multiplyBy2);

        System.out.println(combinedFunction.apply(2, 5));

    }
}
