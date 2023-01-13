package rally;

public class Car extends Transport <DriverA> {
    public Car(String brand, String model, double engineVolume, DriverA driver) {
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
        int maxBound = 8;
        int minBound = 3;
        int bestTime = (int) (minBound + (maxBound - minBound)* Math.random());
        System.out.println("Лучшее время для " + getBrand() + " " + getModel() + " " + ": " + bestTime + " минут");
    }

    @Override
    public void maxSpeed() {
        int maxBound = 250;
        int minBound = 140;
        int maxSpeed = (int) (minBound + (maxBound - minBound)* Math.random());
        System.out.println("Максимальная скорость у " + getBrand() + " " +  getModel() + " " +  ": " + maxSpeed + "км");
    }

}
