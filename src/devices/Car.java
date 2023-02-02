package devices;
import creatures.Human;
import Main.Salleable;
public class Car extends Device implements Salleable {
    final String model;
    final String producer;
    String color;
    Double fuel;


    public Car(String producer, String model, String color, double value, int yearOfProduction) {
        super(value, yearOfProduction);
        this.model = model;
        this.producer = producer;
        this.color = color;
    }

    public void newRide() {
        System.out.println("Your new car is: " + producer + " " + model + " " + "color: " + color);
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
                ", value=" + value +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        int sellerCarIndex = -1;
        for(int i=0; i<seller.getGarage().length; i++)
        {
            if(seller.getGarage()[i] == this) {
                sellerCarIndex = i;
                break;
            }
        }
        if (sellerCarIndex == -1)
            throw new Exception("Seller has 0 cars in garage");
        int buyerGarageIndex = -1;
        for(int i=0; i<buyer.getGarage().length; i++){
            if(buyer.getGarage()[i] == null)
            {
                buyerGarageIndex = i;
                break;
            }
            if(buyerGarageIndex == -1)
                throw new Exception("Buyer has 0 free space in garage");
        }
        if(buyer.getCash() < price)
            throw new Exception("Buyer has not enough money to buy car");
        seller.getGarage()[sellerCarIndex]=null;
        buyer.getGarage()[buyerGarageIndex]=this;
        seller.setCash(seller.getCash()+price);
        buyer.setCash(buyer.getCash()-price);
        System.out.println("Transaction finalized");
    }

    @Override
    public void refuel(double fuel) {
        super.refuel(fuel);
    }
}

