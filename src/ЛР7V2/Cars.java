package ЛР7V2;

public  class Cars extends Abstrct {
    public Cars(String model, Double speed){
        super(model, speed);
    }


    @Override
    public void run(){
        System.out.println("Car start");
    }
    @Override
    public void stop(){
        System.out.println("Car stop");
    }

    @Override
    Double SpeeD() {
        return getSpeed();
    }
    @Override
    String ModeL() {
        return getModel();
    }
}
