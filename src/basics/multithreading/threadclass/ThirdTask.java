package src.basics.multithreading.threadclass;

public class ThirdTask extends Thread{
    @Override
    public void run() {
        //third task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.printf("\n %s # task complete",
                Thread.currentThread().getName());
    }
}
