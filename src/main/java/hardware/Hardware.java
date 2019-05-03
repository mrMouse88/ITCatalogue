package hardware;

public class Hardware {
    private String mark;
    private String model;
    private String serialNumber;
    private String room;

    public Hardware(String mark, String model, String serialNumber, String room) {
        this.mark = mark;
        this.model = model;
        this.serialNumber = serialNumber;
        this.room = room;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
