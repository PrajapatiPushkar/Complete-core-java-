package src.JavaOptional;

import jdk.dynalink.linker.MethodTypeConversionStrategy;

import java.util.Optional;

public class FunctionalOperations {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Java");
        Optional<String> nillOptional = Optional.ofNullable(null);

        // ifPresent()
        name.ifPresent(value -> System.out.println(value));
        nillOptional.ifPresent(value -> System.out.println(value));
        name.ifPresent(System.out::println);

        // map()
         Optional<String> upperCase = name.map(value -> value.toUpperCase());
        System.out.println(upperCase.orElse("default"));

        // filter
        Optional<String> temp = name.filter(n -> n.startsWith("P"));
        temp.ifPresent(System.out::println);

        // Combined Operation
        name.filter(n -> n.startsWith("P"))
                .map(String::toUpperCase)
                .ifPresent(System.out::println);
    }
}
