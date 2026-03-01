package src.OppsInJava.Interitance;

//  1. - To invoke parent class variable
class Animal1{
    String color = "White";
}
class Dog1 extends Animal1 {
    String color = " Black ";
    void printColor(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

//  2. - To invoke parent class method

class Animal2 {
    void eat(){
        System.out.println("Eating... ");
    }
}
class Dog2 extends Animal2 {
    void eat(){
        System.out.println("Eating bread...");
        System.out.println("barking....");
    }
    void work(){
        super.eat();

    }
}
//  3. - To invoke parent class constructor



public class SuperKeyword {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.printColor();
        Dog2 d2 = new Dog2();
        d2.work();
    }
}
