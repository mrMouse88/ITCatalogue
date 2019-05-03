package hardware;

public class Monitor extends Hardware {
    private double resolution;

    public Monitor(String mark, String model, String serialNumber, String room, double resolution) {
        super(mark, model, serialNumber, room);
        this.resolution = resolution;
    }
}
