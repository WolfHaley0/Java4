package ЛР7;

public abstract class AbstrctCar {
    private String model;
    private String color;
    private int speed;

    AbstrctCar(String model, String color, int speed){
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public abstract void info();
    public abstract void run();
    public abstract void stop();

    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getSpeed(){
        return speed;
    }

    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
}
