package src.opps;

public class Car {

        int noOfWheels;

        String color;

        float maxSpeed;

        float currentFuelInLiters;

        int NoOfSeats;

        Car () {
            noOfWheels = 4;
            color = "Black";
            maxSpeed = 150;
            currentFuelInLiters = 2;
            noOfWheels = 5;
        }

        public Car start() {
            if (currentFuelInLiters == 0) {
                System.out.println("Car is out of fuel, can not start");
            } else if (currentFuelInLiters < 5) {
                System.out.println("Car is in reserved mode, please refuel.");
                currentFuelInLiters--;
            } else {
                System.out.println("Car is start..burrrh");
                currentFuelInLiters--;
            }
           return this;
        }

        public void drive() {
            currentFuelInLiters--;
            System.out.println("Car is driving");


        }

        public void addFuel(float currentFuelInLiters) {
           this.currentFuelInLiters += currentFuelInLiters;
        }
        public float getCurrentFuelInLiters() {
            return currentFuelInLiters;
        }


}
