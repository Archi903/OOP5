package rally;

public class Bus extends Transport <DriverC>{
    public Bus(String brand, String model, double engineVolume, DriverC driver) {
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
    public void bestLap() {
        int maxBound = 15;
        int minBound = 10;
        int bestTime = (int) (minBound + (maxBound - minBound)* Math.random());
        System.out.println("Лучшее время для " + getBrand() + " " + getModel() + " " + ": " + bestTime + " минут");
    }

    @Override
    public void maxSpeed() {
        int maxBound = 130;
        int minBound = 90;
        int maxSpeed = (int) (minBound + (maxBound - minBound)* Math.random());
        System.out.println("Максимальная скорость у " + getBrand() + " " +  getModel() + " " +  ": " + maxSpeed + "км");
    }
    public void pitStop() {
        super.pitStop();
    }
}

