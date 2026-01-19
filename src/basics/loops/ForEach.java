package src.basics.loops;

public class ForEach {
    public static void main(String[] args) {
        String [] array = new String[] {
                "Ram", "Shyam", "Mohan", "Sita", "Geeta"
        };
        printArray(array);
        printArrayForEach(array);
    }

    public static void printArrayForEach(String[] array) {
        for (String name : array) {
            System.out.println(name);
        }
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
