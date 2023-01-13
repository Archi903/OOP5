package rally;

public abstract class Driver{
    private String name;
    private boolean driverLicense;
    private int experience;

    public Driver(String name, boolean driverLicense, int experience) {
        setName(name);
        setDriverLicense(driverLicense);
        setExperience(experience);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startCar();
    public abstract void stopCar();
    public abstract void refillCar();

    @Override
    public String toString() {
        return "Водитель " + name;
    }
}
