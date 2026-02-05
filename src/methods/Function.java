package src.methods;

public class Function {
    public static void main(String[] args) {
        System.out.println("In main method");
        greeting();
        System.out.println("method calling complete");
        printFirstPattern();
    }

    public static void greeting() {
        System.out.println("Welcome to my coding platform ");
    }
    public static void printFirstPattern() {
        int row = 0;
        while (row < 20){
            System.out.print("*");
            int i = 0;
            while (i < row) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
    }
}
