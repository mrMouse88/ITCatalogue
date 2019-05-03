package software;

import java.util.Objects;

public class Software {
    private String name;
    private String description;
    private String serialCode;

    public Software(String name, String description, String serialCode) {
        this.name = name;
        this.description = description;
        this.serialCode = serialCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Software software = (Software) o;
        return name.equals(software.name) &&
                serialCode.equals(software.serialCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serialCode);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSerialCode() {
        return serialCode;
    }

    public void setSerialCode(String serialCode) {
        this.serialCode = serialCode;
    }
}
