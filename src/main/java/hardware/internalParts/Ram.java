package hardware.internalParts;

public class Ram {
    private String brand;
    private RamType ramType;
    private double clockSpeed;
    private int capacity;

    public Ram(String brand, RamType ramType, double clockSpeed, int capacity) {
        this.brand = brand;
        this.ramType = ramType;
        this.clockSpeed = clockSpeed;
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public RamType getRamType() {
        return ramType;
    }

    public void setRamType(RamType ramType) {
        this.ramType = ramType;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
