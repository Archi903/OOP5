package rally;

public class Track extends Transport <DriverB>{

    public Track(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startCar() {
        super.startCar();
    }
    public void stopCar(){
        super.stopCar();
    }
    @Override
    public void pitStop(){
        super.pitStop();
    }

    @Override
    public void bestLap() {
        int maxBound = 13;
        int minBound = 8;
        int bestTime = (int) (minBound + (maxBound - minBound)* Math.random());
        System.out.println("Лучшее время для " + getBrand() + " " + getModel() + " " + ": " + bestTime + " минут");
    }

    @Override
    public void maxSpeed() {
        int maxBound = 110;
        int minBound = 160;
        int maxSpeed = (int) (minBound + (maxBound - minBound)* Math.random());
        System.out.println("Максимальная скорость у " + getBrand() + " " +  getModel() + " " +  ": " + maxSpeed + "км");
    }

}
