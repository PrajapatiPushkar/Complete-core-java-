package src.methods;

import java.util.Scanner;

public class ReturnStatement {
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("sum of the number is: " + sum);
    }

    public static int readNumber () {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int number = input.nextInt();
        return number;
    }

    public static void greet() {
        System.out.println("Welcome to Calculator");
    }
}
