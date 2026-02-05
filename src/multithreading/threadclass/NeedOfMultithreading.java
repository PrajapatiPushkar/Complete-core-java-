package src.multithreading.threadclass;

public class NeedOfMultithreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //first tak
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n * task complete");

        //second tak
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);
        }
        System.out.println("\n $ task complete");

        //third tak
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n # task complete");



        long endTime = System.currentTimeMillis();
        System.out.printf("Total timme taken: %d", (endTime - startTime));

    }
}
