package src.basics.multithreading.runnable;

public class PrintTask implements Runnable{

    @Override
    public void run() {
        //Print tak
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d%c ", i, targetChar);
        }
        System.out.printf("\n %s  task complete",
                Thread.currentThread().getName(),
                targetChar);
    }


    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
