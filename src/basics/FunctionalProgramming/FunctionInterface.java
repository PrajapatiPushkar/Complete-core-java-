package src.basics.FunctionalProgramming;

import java.util.function.Function;

public class FunctionInterface {

    public static Function<Integer, Integer> addFunction = (a) -> a + 3;

    public static void main(String[] args) {
        System.out.println(addFunction.apply(10));

    }
}
