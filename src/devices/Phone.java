package devices;
import Main.Salleable;
import creatures.Human;

import java.util.List;

public class Phone extends Device implements Salleable {
    boolean isAndroid;
    public Phone(String producer, String model, int yearOfProduction, boolean isAndroid, double value){
        super(value, yearOfProduction);
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.isAndroid = true;
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
    void installAnnApp(String appName)
    {
        this.installAnnApp(appName);
    }
    void installAnnApp(String appName, double version)
    {
        this.installAnnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }
    void installAnnApp(String nameOfApp, double version, String ipAdress)
    {
        System.out.println("Instaluje aplikacje: "+nameOfApp+ " wersja: "+version+ " ip adress: "+ipAdress);
        System.out.println("Zainstalowano");
    }
    public void installAnnApp(List<String> appNames)
    {
        for(String appName: appNames)
        {
            this.installAnnApp(appName);
        }
    }

    private static final String DEFAULT_SERVER_ADDRESS = "https://milosz.appserver.com";
    private static final String DEFAULT_APP_VERSION = "latest-stable";

}
