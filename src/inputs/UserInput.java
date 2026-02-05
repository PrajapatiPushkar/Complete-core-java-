package src.inputs;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
        System.out.println("Also, Tell me your name: ");
        int age = input.nextInt();
        System.out.println("Your age is: " + age);


    }
}
