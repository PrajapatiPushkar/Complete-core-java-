package src.JavaOptional;

import java.lang.management.OperatingSystemMXBean;
import java.util.Optional;

public class NEPDemo {
    public static void main(String[] args) {

        // Normal Ways
        String name = "Java";
        if (name != null)
            System.out.println(name.length());
        else
            System.out.println("No name value");

        // Optional
        Optional<String> optionalString = Optional.of("Java");
        System.out.println(optionalString);

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> mayBe = Optional.ofNullable(null);
        System.out.println(mayBe);

        // Checking Values
        System.out.println(optionalString.isPresent());
        System.out.println(mayBe.isPresent());

        System.out.println(optionalString.isEmpty());
        System.out.println(mayBe.isEmpty());

        // get()
        System.out.println(optionalString.get());
//        System.out.println(mayBe.get()); //getting error

        // orElse("default-value")
        System.out.println(optionalString.orElse("Default"));
        System.out.println(mayBe.orElse("Default"));
        System.out.println(mayBe.orElse(null));

        // orElseGet(<supplier>)
        String result = mayBe.orElseGet(() -> {
            System.out.println("Generating  Default Value");
            return "Default";
        });
        System.out.println(result);

        // orElseThrow()
        String newResult = optionalString.orElseThrow(
                () -> new RuntimeException("Not Found")
        );
        System.out.println(newResult);
    }
}
