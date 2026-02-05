package src.FunctionalProgramming;

/***
 * this is an example of functional interfaces
 */

@FunctionalInterface
interface BookAction {
    void perform();
}

//Functional Interfaces with parameters
@FunctionalInterface
interface Operation {
    int add(int a, int b);
}

//parameter -> expression body
//()-> {}

public class FunctionalInterfaces {
    public static void main(String[] args) {
        //STEP 1
        BookAction action1 = new BookAction() {
            @Override
            public void perform() {
                System.out.println("Action performs 1");
            }
        };
        action1.perform();

        //STEP 2
        BookAction action2 = () -> {
            System.out.println("Action performs 2 ");
        };
        action2.perform();

        //STEP 3
        BookAction action3 = () -> System.out.println("Action performs 3");
        action3.perform();

        //Function interfaces with parameters
        Operation operation1 = new Operation() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(operation1.add(10, 10));

       // Operation operation2 = Integer::sum;

        Operation operation = (int a, int b) -> {
            return a + b;
        };
        System.out.println(operation.add(10, 20));

        //THREAD INTERFACE
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();

        new Thread(() ->System.out.println("New Thread created")).start();
    }
}
