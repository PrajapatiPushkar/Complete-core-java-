package src.basics.loops;

public class LearningIf {
    public static void main(String[] args) {
        boolean isMale = false;
        String name = "Bob";

        System.out.println("before if");
        if (isMale) {
            System.out.println("Mr. " + name);
        } else {
            System.out.println("Mrs. " + name);
        }
        System.out.println("after if");

        boolean isSeniorCitizen = true;
        boolean isAnAdult = false;

        if (isSeniorCitizen) {
            System.out.println("Hello senior citizen");
        } else if (isAnAdult) {
               System.out.println("Helo Adult");
        }else {
                System.out.println("hlo child");

        }

    }
}
