package devices;
import Main.Salleable;
import creatures.Human;

public class Phone extends Device implements Salleable {
    boolean isAndroid;
    public Phone(String producer, String model, int yearOfProduction, boolean isAndroid){
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.isAndroid = isAndroid;
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(this.equals(seller.getPhone()) && buyer.getCash() >= price){
            seller.setCash(seller.getCash()+price);
            buyer.setCash(buyer.getCash()-price);
            buyer.setPhone(this);
            seller.setPhone(null);
            System.out.println("Transakcja udana");
        }else {
            System.out.println("Transakcja sie nie powiodla");
        }
    }
}
