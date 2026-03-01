package src.OppsInJava.Interitance;

interface Car {
    public void start();
}

class ElectricCar implements Car{
    public void start(){
        System.out.println("Electric car strats");
    }
}

class DieselCar implements Car {
    public void start() {
        System.out.println("Diesel car starts");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Car Tesla = new ElectricCar();
        Car swift = new DieselCar();
        Tesla.start();
        swift.start();
    }
}
