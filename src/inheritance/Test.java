package src.inheritance;

public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();


        TwoWheeler twoWheeler = new TwoWheeler();
        vehicle.commute();
        twoWheeler.commute();

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.commute();
        motorCycle.balance();

    }
}
