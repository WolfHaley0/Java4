package ЛР7V2;

public  abstract class Abstrct {
    private String name;
    public Double salary;

    public  Abstrct (String name, Double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public Double getSalary() {
        return salary;
    }
    abstract Double GETSalary();
}
