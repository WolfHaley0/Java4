package ЛР7V2;

public class Fix extends Abstrct {
    public Fix(String name, Double salary){
        super(name, salary);
    }

    @Override
    Double GETSalary() {
        return salary;
    }
}
