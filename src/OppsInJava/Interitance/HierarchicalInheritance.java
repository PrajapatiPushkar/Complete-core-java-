package src.OppsInJava.Interitance;

class A1{
    public void print(){
        System.out.println("Class A method");
    }
}

class B1 extends A1 {
    public void printB(){
        System.out.println("Class B method");
    }
}
class C1 extends A1 {
    public void printC(){
        System.out.println("Class C method");
    }
}


public class HierarchicalInheritance {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.print();
        C1 obj1 = new C1();
        obj1.print();
    }
}
