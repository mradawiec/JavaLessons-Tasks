package Main;

import creatures.Human;
import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
        Application Pepper = new Application("Pepper", "1.23", 10.0);
        Application Todo = new Application("Todo", "1.23", 9.99);
        Application Facebook = new Application("Facebook", "1.32", 12.99);
        Application Whatsup = new Application("Whatsup", "2.3", 0.0);
        Phone Samsung = new Phone("Samsung", "Galaxy S22", 2022, true, 1999.99);
        Human Marek = new Human("Marek");
        Marek.setPhone(Samsung);
        Marek.setCash(50.0);
        Samsung.installAnnApp(Marek,Pepper);
        System.out.println(Marek.getCash());
        Samsung.installAnnApp(Marek,Todo);
        Marek.getCash();
        Samsung.installAnnApp(Marek,Facebook);
        Marek.getCash();
        Samsung.installAnnApp(Marek,Whatsup);
        Marek.getCash();

        System.out.println("Is Pepper installed? " + Samsung.isAppInstalled(Pepper));
        System.out.println("Is Pepper installed? " + Samsung.isAppInstalledByName("Appstore"));
        System.out.println("Free apps");
        Samsung.freeApps();
        System.out.println("Installed apps value: " + Samsung.appsValue());
        System.out.println("Installed apps sorted alphabetically:");
        Samsung.printInstalledAppsAlphabetically();

        System.out.println("Installed apps sorted by value:");
        Samsung.printInstalledAppsByValue();
    }
}