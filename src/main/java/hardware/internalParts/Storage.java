package hardware.internalParts;

public class Storage {
    private StorageType storageType;
    private int capacity;

    public Storage(StorageType storageType, int capacity) {
        this.storageType = storageType;
        this.capacity = capacity;
    }

    public StorageType getStorageType() {
        return storageType;
    }

    public void setStorageType(StorageType storageType) {
        this.storageType = storageType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
