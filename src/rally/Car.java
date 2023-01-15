package rally;

import java.util.Arrays;

public class Car extends Transport<DriverA> {

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        WAGON("Универсал"),
        OFFROAD("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        public static BodyType findByVoice(String settingBody) {
            for (BodyType body : values()) {
                if (body.getSettingBody().equals(settingBody)) {
                    return body;
                }
            }
            return null;
        }

        private final String settingBody;

        BodyType(String settingBody) {
            this.settingBody = settingBody;
        }


        public String getSettingBody() {
            return settingBody;
        }

    }

    private final BodyType bodyType;

    public Car(String brand, String model, double engineVolume, DriverA driver, String bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType = BodyType.findByVoice(bodyType);
    }

    @Override
    public void startCar() {
        super.startCar();
    }

    public void stopCar() {
        super.stopCar();
    }

    @Override
    public void pitStop() {
        super.pitStop();
    }

    @Override
    public void bestLap() {
        int maxBound = 8;
        int minBound = 3;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время для " + getBrand() + " " + getModel() + " " + ": " + bestTime + " минут");
    }

    @Override
    public void maxSpeed() {
        int maxBound = 250;
        int minBound = 140;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " " + ": " + maxSpeed + "км");
    }

    @Override
    public void printType() {
        if (bodyType == null || bodyType.settingBody.isEmpty() || bodyType.settingBody.isBlank()) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства: " + bodyType.settingBody);
        }
    }

    @Override
    public String toString() {
        return "Тип кузова: " + bodyType.settingBody + ". Машина: " +
                "Бренд = " + getBrand() +
                ", модель = " + getModel() +
                ", мощность двигателя = " + getEngineVolume();

    }
}
