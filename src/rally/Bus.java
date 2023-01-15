package rally;

public class Bus extends Transport<DriverC> {

    public enum BodyType {
        N1(10),
        N2(25),
        N3(40),
        N4(50),
        N5(60),
        N6(80),
        N7(100),
        N8(120);

        public static String findByVoice(float settingBody) {
            for (Bus.BodyType body : values()) {
                if (settingBody < N1.settingBody) {
                    String track1 = N1.settingBody + " мест";
                    return track1;
                } else if (settingBody >= N1.settingBody && settingBody <= N2.settingBody) {
                    String track1 = N1.settingBody + " - " + N2.settingBody + " мест";
                    return track1;
                } else if (settingBody >= N3.settingBody && settingBody <= N4.settingBody) {
                    String track1 = N3.settingBody + " - " + N4.settingBody + " мест";
                    return track1;
                } else if (settingBody >= N5.settingBody && settingBody <= N6.settingBody) {
                    String track1 = N5.settingBody + " - " + N6.settingBody + " мест";
                    return track1;
                } else if (settingBody >= N7.settingBody && settingBody <= N8.settingBody) {
                    String track1 = N7.settingBody + " - " + N8.settingBody + " мест";
                    return track1;
                }
            }
            return null;
        }


        private final Integer settingBody;


        BodyType(Integer settingBody) {
            this.settingBody = settingBody;

        }

        public Integer getSettingBody() {
            return settingBody;
        }
    }

    private final Integer bodyType;

    public Bus(String brand, String model, double engineVolume, DriverC driver, Integer bodyType) {
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
    public void bestLap() {
        int maxBound = 15;
        int minBound = 10;
        int bestTime = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время для " + getBrand() + " " + getModel() + " " + ": " + bestTime + " минут");
    }

    @Override
    public void maxSpeed() {
        int maxBound = 130;
        int minBound = 90;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " " + ": " + maxSpeed + "км");
    }

    public void pitStop() {
        super.pitStop();
    }
    public void printType() {
        if (bodyType < BodyType.N1.settingBody && bodyType > 0) {
            System.out.println("Тип транспортного средства: особо малая");
        } else if (bodyType >= BodyType.N1.settingBody && bodyType <= BodyType.N2.settingBody) {
            System.out.println("Тип транспортного средства: малая");
        } else if (bodyType >= BodyType.N3.settingBody && bodyType <= BodyType.N4.settingBody) {
            System.out.println("Тип транспортного средства: средняя");
        } else if (bodyType >= BodyType.N5.settingBody && bodyType <= BodyType.N6.settingBody) {
            System.out.println("Тип транспортного средства: большая");
        } else if (bodyType >= BodyType.N7.settingBody && bodyType <= BodyType.N8.settingBody) {
            System.out.println("Тип транспортного средства: особо большая");
        } else if (bodyType <= 0) {
            System.out.println("В поле введены некорректные данные");
        }
        else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public String toString() {
        return "Вместимость: " + Bus.BodyType.findByVoice(bodyType) + ". Машина: " +
                ", Бренд = " + getBrand() +
                ", модель = " + getModel() +
                ", мощность двигателя = " + getEngineVolume();
    }
}

