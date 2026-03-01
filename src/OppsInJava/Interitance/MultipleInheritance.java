package src.OppsInJava.Interitance;

interface A {
    public void run();
}

interface B {
    public void run();
}

class C implements A,B {
    public void run(){
        System.out.println("C class run method");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.run();
    }
}
