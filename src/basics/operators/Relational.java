package src.basics.operators;

import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to driving portal");

        System.out.println("enter your age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("eligible to drive the car. ");
        } else {
            System.out.println("bata cycle chalao. ");
        }
    }
}
