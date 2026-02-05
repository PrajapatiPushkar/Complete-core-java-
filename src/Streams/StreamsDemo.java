package src.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        //Streams --> Assembly line / pipelines
        List<String> items = Arrays.asList("Apple ", "Banana ", "Mango \n");
        for (String fruit : items)
            System.out.print(fruit);

        //using Streams
        Stream<String> stream = items.stream();
//        stream.forEach((item) -> System.out.println(items));
        stream.forEach(System.out::print);

        Stream<String> stream1 = items.stream();
         Stream<String> filteredStream =  stream1.filter(name -> name.startsWith("B"));
        filteredStream.forEach(System.out::print);
    }
}
