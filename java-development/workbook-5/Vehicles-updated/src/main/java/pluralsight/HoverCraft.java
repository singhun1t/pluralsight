package pluralsight;

public class HoverCraft extends Vehicle {

    public HoverCraft(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int airCushionPressure) {
        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.airCushionPressure = airCushionPressure;
    }

    private int airCushionPressure;

    public int getAirCushionPressure() {
        return airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    public void hover() {
        System.out.println("Hovercraft is hovering.");
    }
}
