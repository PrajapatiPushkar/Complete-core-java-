package src.TerminalOperation;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperationDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 55);
        // reduce()

        Stream<Integer> integerStream = numbers.stream();
//        int sum = integerStream.reduce(0, (acc, num) -> acc + num);
        int sum = integerStream.reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        int total = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("ToTal: " + total);


        // collect()
        List<Integer> evenNumber = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Number: " + evenNumber);

        Set<Integer> evenNumberSet = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println("Even Number: " + evenNumberSet);

        // find & match
        System.out.println(numbers.stream().findFirst().get());

        boolean has40 = numbers.stream()
                .anyMatch(n -> n == 41);
        System.out.println(has40);

        // iteration
        //first way
        numbers
                .forEach(System.out::println);

        //second way
        numbers.stream()
                .forEach(n -> System.out.println(n));

    }
}
