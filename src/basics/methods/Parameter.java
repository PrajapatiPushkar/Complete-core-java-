package src.basics.methods;

public class Parameter {
    public static void main(String[] args) {

        System.out.println( sumTwoNumbers(4,7));
        System.out.println( sumTwoNumbers(12,23));
        System.out.println( sumTwoNumbers(10,10));
    }

    public static int sumTwoNumbers(int first, int second){
        System.out.println("First number received: " + first);
        System.out.println("second number received: " + second);
        int sum = first + second;
        return sum;

    }

}
