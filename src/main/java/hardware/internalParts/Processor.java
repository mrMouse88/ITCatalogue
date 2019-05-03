package hardware.internalParts;

public class Processor {
    private ProcessorBrand processorBrand;
    private String model;
    private double clockSpeed;

    public Processor(ProcessorBrand processorBrand, String model, double clockSpeed) {
        this.processorBrand = processorBrand;
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    public ProcessorBrand getProcessorBrand() {
        return processorBrand;
    }

    public void setProcessorBrand(ProcessorBrand processorBrand) {
        this.processorBrand = processorBrand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }
}
