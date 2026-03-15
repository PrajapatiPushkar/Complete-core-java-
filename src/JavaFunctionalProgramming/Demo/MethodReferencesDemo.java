package src.JavaFunctionalProgramming.Demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferencesDemo {
    public static void main(String[] args) {
        // ::
        // STEP 1
        List<String> names = Arrays.asList("Alice", "Charlie", "Bob");
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        // STEP 2 using enhanced for
        for (String name : names)
            System.out.println(name);

        // Step 3
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String names) {
                System.out.println(names);
            }
        });

        // STEP 4
        names.forEach(( name) -> {
            System.out.println(name);
        });

        // Step 5
        names.forEach(System.out::println);

    }
}
