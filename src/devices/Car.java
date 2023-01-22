package devices;
import creatures.Human;
import Main.Salleable;
public class Car extends Device implements Salleable {
    final String model;
    final String producer;
    String color;
    Double engineCapacity;
    public Double value;
    Double fuel;


    public Car(String producer, String model, String color, Double engineCapacity, Double value) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.value = value;
    }

    public void newRide() {
        System.out.println("Your new car is: " + producer + " " + model + " " + "color: " + color + ", and has engine capacity: " + engineCapacity);
    }

    @Override
    public void turnOn() {

    }

    @Override
    public String toString() {
        return "devices.Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", value=" + value +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (this.equals(seller.getCar()) && buyer.getCash() >= price) {
            seller.setCash(seller.getCash() + price);
            buyer.setCash(buyer.getCash() - price);
            buyer.setCar(this);
            seller.setCar(null);
            System.out.println("Transakcja udana");
        } else {
            System.out.println("Transakcja sie nie powiodla");
        }
    }

    @Override
    public void refuel(double fuel) {
        super.refuel(fuel);
    }
}

