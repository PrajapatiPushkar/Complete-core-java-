package src.basics.opps;

public class Driver {

    static int minAgeForDriving = 18;

    int age;

    String name;

    String dataOfLicence;

    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }
    public static void main(String[] args) {


//        Car myCAr = new Car();
//        myCAr.addFuel(6);
//        myCAr.drive();
//        myCAr.drive();
//        myCAr.addFuel(3);
//        myCAr.drive();
//        System.out.println(myCAr.getCurrentFuelInLiters());

        Car swift = new Car();
        swift.start().drive();
        System.out.println(swift.color);
//
//        Driver myDriver = new Driver();
//        myDriver.dataOfLicence = "1/jan/2024";
//        System.out.println(minAgeForDriving);
    }
}
