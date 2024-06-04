package pluralsight;

public class Main {
    public static void main(String[] args) {
       Moped slowRide = new Moped("mitsubishi","blue",45,24,2,4,150);
       SemiTruck semiTruck = new SemiTruck("ford","red",170,180,6,300,1);
       HoverCraft hoverCraft = new HoverCraft("Lexus","yellow",89,12,2,3,5);
       Car car = new Car("Bmw","black",142,21,5,3,4);

        // Test the functionality of the classes and methods
        slowRide.ride();
        semiTruck.loadCargo();
        hoverCraft.hover();
        car.openTrunk();

        // Accessing Vehicle getters
        System.out.println("Color of the Moped: " + slowRide.getColor());
        System.out.println("Fuel capacity of the SemiTruck: " + semiTruck.getFuelCapacity());
        System.out.println("Air cushion pressure of the HoverCraft: " + hoverCraft.getAirCushionPressure());
        System.out.println("Top speed of the Car: " + car.getTopSpeed());
    }
}
