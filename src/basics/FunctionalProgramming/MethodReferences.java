package src.basics.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferences {
    public static void main(String[] args) {
        // ::
        // 1 using for loops
        List<String> names = Arrays.asList("Alice ", "Bob ", "Charlie ");
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i));
        }

        //using enhanced for
        for (String name : names)
            System.out.print(name);

        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.print(name);
            }
        });
    }
}
