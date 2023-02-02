package devices;
import Main.Application;
import Main.Salleable;
import creatures.Human;

import java.util.*;

public class Phone extends Device implements Salleable {
    private Set<Application> apps;
    boolean isAndroid;
    public Phone(String producer, String model, int yearOfProduction, boolean isAndroid, double value){
        super(value, yearOfProduction);
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.isAndroid = true;
        this.apps = new HashSet<>();
    }
    public void addApp(Application app){
        this.apps = new HashSet<>();
    }
    public Set<Application> getApps(){
        return apps;
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
    public void installAnnApp(Human human,Application app)
    {
        double appValue = app.getValue();
        if(app.getValue() <= human.getCash())
        {
            apps.add(app);
            human.setCash(human.getCash()-appValue);
        }else{
            System.out.println("You don't have enough money to buy this app");
        }
    }
    public boolean isAppInstalled(Application app){
        return apps.contains(app);
    }
    public boolean isAppInstalledByName(String appName) {
        for (Application app : apps) {
            if(app.getName().equals(appName)) {
                return true;
            }
        }
        return false;
    }
    public void freeApps(){
        for(Application app: apps){
            if(app.getValue() == 0){
                System.out.println(app.getName());
            }
        }
    }
    public double appsValue(){
        double value = 0.0;
        for(Application app : apps){
            if(app != null){
                value += app.getValue();
            }
        }
        return value;
    }
    public void printInstalledAppsAlphabetically() {
        List<Application> sortedApps = new ArrayList<>(apps);
        sortedApps.sort(Comparator.comparing(Application::getName));
        for (Application app : sortedApps) {
            System.out.println(app.getName());
        }
    }

    public void printInstalledAppsByValue() {
        List<Application> sortedApps = new ArrayList<>(apps);
        sortedApps.sort(Comparator.comparingDouble(Application::getValue));
        for (Application app : sortedApps) {
            System.out.println(app.getName());
        }
    }
//    void installAnnApp(String appName, double version)
//    {
//        this.installAnnApp(appName, version, DEFAULT_SERVER_ADDRESS);
//    }
//    void installAnnApp(String nameOfApp, double version, String ipAdress)
//    {
//        System.out.println("Instaluje aplikacje: "+nameOfApp+ " wersja: "+version+ " ip adress: "+ipAdress);
//        System.out.println("Zainstalowano");
//    }
//    public void installAnnApp(List<String> appNames)
//    {
//        for(String appName: appNames)
//        {
//            this.installAnnApp(appName);
//        }
//    }

    private static final String DEFAULT_SERVER_ADDRESS = "https://milosz.appserver.com";
    private static final String DEFAULT_APP_VERSION = "latest-stable";

}
