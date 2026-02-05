package src.loops;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i < 200; i++) {
            if (i == 101){
                //break;
                continue;
            }
            System.out.println(i);
        }
    }
}
