package hardware;

import employees.Employee;
import hardware.internalParts.Processor;
import hardware.internalParts.Ram;
import hardware.internalParts.Storage;
import software.OperatingSystem;
import software.Software;

import java.util.List;

public class Computer extends Hardware{
    private Employee employee;
    private Processor processor;
    private Storage storage;
    private Ram ram;
    private OperatingSystem operatingSystem;
    private List<Monitor> monitors;
    private List<Software> softwareList;

    public Computer(String mark, String model, String serialNumber, String room,
                    Employee employee, Processor processor, Storage storage, Ram ram, OperatingSystem operatingSystem,
                    List<Monitor> monitors, List<Software> softwareList) {
        super(mark, model, serialNumber, room);
        this.employee = employee;
        this.processor = processor;
        this.storage = storage;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        this.monitors = monitors;
        this.softwareList = softwareList;
    }

    //constructor without monitors list for laptop implementation
    public Computer(String mark, String model, String serialNumber, String room,
                    Employee employee, Processor processor, Storage storage, Ram ram, OperatingSystem operatingSystem,
                    List<Software> softwareList) {
        super(mark, model, serialNumber, room);
        this.employee = employee;
        this.processor = processor;
        this.storage = storage;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
        this.softwareList = softwareList;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public List<Monitor> getMonitors() {
        return monitors;
    }

    public void setMonitors(List<Monitor> monitors) {
        this.monitors = monitors;
    }

    public List<Software> getSoftwareList() {
        return softwareList;
    }

    public void setSoftwareList(List<Software> softwareList) {
        this.softwareList = softwareList;
    }
}
