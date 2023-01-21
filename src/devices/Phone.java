package devices;

public class Phone extends Device{
    boolean isAndroid;
    public Phone(String producer, String model, int yearOfProduction){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }
    @Override
    public void turnOn() {
        System.out.println("Wcisnieto przycisk");
        System.out.println("Czekaj");
        System.out.println("Telefon wlaczony");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "isAndroid=" + isAndroid +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
