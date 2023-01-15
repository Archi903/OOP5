package rally;

public class Track extends Transport<DriverB> {
    public enum BodyType {
        LOW_BOUND(3.5f),
        TOP_BOUND(12);

        public static String findByVoice(float settingBody) {
            for (Track.BodyType body : values()) {
                if (settingBody < LOW_BOUND.settingBody) {
                    String track1 = "до " + LOW_BOUND.settingBody + " тонн";
                    return track1;
                } else if (settingBody >= LOW_BOUND.settingBody && settingBody <= TOP_BOUND.settingBody) {
                    String track1 = "от " + LOW_BOUND.settingBody + " тонн до " + TOP_BOUND.settingBody + " тонн";
                    return track1;
                } else {
                    String track1 = "до " + TOP_BOUND.settingBody + " тонн";
                    return track1;
                }
            }
            return null;
        }


        private final float settingBody;


        BodyType(float settingBody) {
            this.settingBody = settingBody;

        }

        public float getSettingBody() {
            return settingBody;
        }
    }

    private final float bodyType;

    public Track(String brand, String model, double engineVolume, DriverB driver, float bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
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
        int maxBound = 13;
        int minBound = 8;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время для " + getBrand() + " " + getModel() + " " + ": " + bestTime + " минут");
    }

    @Override
    public void maxSpeed() {
        int maxBound = 110;
        int minBound = 160;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " " + ": " + maxSpeed + "км");
    }

    @Override
    public String toString() {
        return "Грузоподъемность: " + BodyType.findByVoice(bodyType) + ". Машина: " +
                ", Бренд = " + getBrand() +
                ", модель = " + getModel() +
                ", мощность двигателя = " + getEngineVolume();
    }
    public void printType() {
        if (bodyType < BodyType.LOW_BOUND.settingBody) {
            System.out.println("Тип транспортного средства: N1");
        } else if (bodyType >= BodyType.LOW_BOUND.settingBody && bodyType <= BodyType.TOP_BOUND.settingBody) {
            System.out.println("Тип транспортного средства: N2");
        } else if (bodyType >= BodyType.TOP_BOUND.settingBody) {
            System.out.println("Тип транспортного средства: N3");
        } else if (bodyType <= 0){
            System.out.println("В поле введены некорректные данные");
        } else  {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

}
