package rally;

public class Main {
    public static void main(String[] args) {

        DriverA john = new DriverA("John", true, 5);
        DriverB smith = new DriverB("Smith", true, 10);
        DriverC alex = new DriverC("Alex", true, 7);

        Car lada = new Car("Lada", "Granta", 1.6, john);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 5, john);
        Car bmw = new Car("BMW", "Z8", 4, john);
        Car lexus = new Car("Lexus", "IS 350", 3.5, john);

        Bus gaz = new Bus("Газ", "Сибирь", 3, alex);
        Bus mercedes = new Bus("Mercedes", "Viano", 3.8, alex);
        Bus volkswagen = new Bus("Volkswagen", "Transporter", 3.5, alex);
        Bus ford = new Bus("Ford", "Escaper", 2.8, alex);

        Track gazel = new Track("Газель", "Урал", 3, smith);
        Track volvo = new Track("Volvo ", "Siber", 6.5, smith);
        Track fiat = new Track("Fiat", "Drive", 5, smith);
        Track hyundai = new Track("Hyundai", "Pride", 4.3, smith);

    driverAnnounce(bmw);
    driverAnnounce(gazel);
    }
        public static void driverAnnounce (Transport<?> transport){
            System.out.println(transport.getDriver() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде");
        }


}