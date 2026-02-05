package src.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentSourcesDemo {
    public static void main(String[] args) {
        //From Collection
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9);
        Stream<Integer> integerStream = numbers.stream();
        integerStream.forEach(System.out::println);

        //From Arrays
        int[] numberArray = {1, 2, 3, 4, 5};
        IntStream arrayStream = Arrays.stream(numberArray);
        arrayStream.forEach(System.out::println);

        //From Specific Values
        Stream<String> stringStream = Stream.of("a", "b", "c");
        stringStream.forEach(System.out::println);


    }
}
