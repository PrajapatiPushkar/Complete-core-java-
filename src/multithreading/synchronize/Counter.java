package src.multithreading.synchronize;

public class Counter {

    private int count = 1;

    private void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
