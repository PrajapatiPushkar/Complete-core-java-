package src.JavaFunctionalProgramming.Demo;

@FunctionalInterface
interface BookAction {
    void perform();
}

//Functional interface with parameters
@FunctionalInterface
interface Operation {
    int add(int a, int b);
}


// parameter -> expression body
// () -> {}


public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
//        This is the normal way - STEP -1
        BookAction action1 = new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action Performed");
            }
        };
        action1.perform();
        // Step - 2
        BookAction action2 = () -> {
            System.out.println("Action Performed");
        };
        action2.perform();

        // STEP - 3
        BookAction action3 = () -> System.out.println("Action Performed");
        action3.perform();

        // Functional interface with parameters
        // STEP 1
        Operation operation1 = new Operation() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(operation1.add(2, 3));

        // Step 2
        Operation operation2 = (int a, int b) -> {
            return a + b;
        };
        System.out.println(operation2.add(5,2));

        // THREAD INTERFACE
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread created");
            }
        }).start();

        new Thread(() -> System.out.println("New Thread created")).start();

    }
}
