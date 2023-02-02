package devices;

public abstract class Device {
    String producer;
    String model;
    int yearOfProduction;

    public Device(double value, int yearOfProduction) {
        this.value = value;
        this.yearOfProduction = yearOfProduction;
    }

    double value;

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public void refuel(double fuel) {

    }
    public double getValue() {
        return value;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
