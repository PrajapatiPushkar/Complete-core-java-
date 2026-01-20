package src.basics.nested;

public class Car {

    private int noOfDoors;

    public void repair() {
        Tire t = new Tire();
    }

    protected  class Tire {
        private double width;

        private double pressure;

        private String material;

        public void inflate() {
          noOfDoors = 2;
          repair();
        }

    }
}
