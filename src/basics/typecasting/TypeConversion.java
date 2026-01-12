package src.basics.typecasting;

public class TypeConversion {
    public static void main(String[] args) {
        float myFloat = 5;
        System.out.println(myFloat);

        int myInt = (int)5.0f;
        System.out.println(myInt);
        // implicit
        long big = 45;
        float dec = 3;
        double d =  3.4f;

        // explicit
        float eDec = (float) 3.4;
        long eBig = (long) 3.4;
        int eInt = (int) 3.4;

    }
}
