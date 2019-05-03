package hardware;

import employees.Employee;
import hardware.internalParts.Processor;
import hardware.internalParts.Ram;
import hardware.internalParts.Storage;
import software.OperatingSystem;
import software.Software;

import java.util.List;

public class Laptop extends Computer {
    private double resolution;

    public Laptop(String mark, String model, String serialNumber, String room, Employee employee, Processor processor,
                  Storage storage, Ram ram, OperatingSystem operatingSystem, List<Software> softwareList,
                  double resolution) {
        super(mark, model, serialNumber, room, employee, processor, storage, ram, operatingSystem, softwareList);
        this.resolution = resolution;
    }
}
