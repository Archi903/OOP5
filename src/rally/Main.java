package rally;

public class Main {
    public static void main(String[] args) {


        DriverA john = new DriverA("John", true, 5);
        DriverB smith = new DriverB("Smith", true, 10);
        DriverC alex = new DriverC("Alex", true, 7);

        Car lada = new Car("Lada", "Granta", 1.6, john, "Седан");
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 5, john, "Универсал");
        Car bmw = new Car("BMW", "Z8", 4, john, "Купе");
        Car lexus = new Car("Lexus", "IS 350", 3.5, john, "Хетчбэк");

        Bus gaz = new Bus("Газ", "Сибирь", 3, alex, 5);
        Bus mercedes = new Bus("Mercedes", "Viano", 3.8, alex, 45);
        Bus volkswagen = new Bus("Volkswagen", "Transporter", 3.5, alex, 65);
        Bus ford = new Bus("Ford", "Escaper", 2.8, alex, 110);

        Track gazel = new Track("Газель", "Урал", 3, smith, 2);
        Track volvo = new Track("Volvo ", "Siber", 6.5, smith, 6);
        Track fiat = new Track("Fiat", "Drive", 5, smith, 13);
        Track hyundai = new Track("Hyundai", "Pride", 4.3, smith, 4);


    }

    public static void driverAnnounce(Transport<?> transport) {
        System.out.println(transport.getDriver() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");

    }

}