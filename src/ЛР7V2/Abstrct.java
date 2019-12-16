package ЛР7V2;

public  abstract class Abstrct {
    private String model;
    private Double speed;

    public  Abstrct (String model, Double speed){
        this.model = model;
        this.speed = speed;
    }

    public abstract void run();
    public abstract void stop();

    public String getModel() {
        return model;
    }
    public Double getSpeed() {
        return speed;
    }

    abstract Double SpeeD();
    abstract String ModeL();
}
