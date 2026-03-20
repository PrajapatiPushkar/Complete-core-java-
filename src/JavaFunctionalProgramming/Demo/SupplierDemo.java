package src.JavaFunctionalProgramming.Demo;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Double> randomNum = Math::random;
        System.out.println(randomNum.get());
    }
}
