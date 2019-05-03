package hardware;

public class Printer extends Hardware {

    private PrinterType printerType;

    public Printer(String mark, String model, String serialNumber, String room, PrinterType printerType) {
        super(mark, model, serialNumber, room);
        this.printerType = printerType;
    }
}
