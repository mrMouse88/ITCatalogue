package employees;

 public enum Department {
    GROMADZENIE ("gromadzenie"),
     DIGITALIZACJA("sekcja digitalizacji");

    private String description;

    public String getDescription(){
        return description;
    }

    Department(String description){
        this.description = description;
    }
}
