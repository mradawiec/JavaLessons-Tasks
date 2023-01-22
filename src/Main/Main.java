package Main;

import creatures.Human;
import creatures.Animal;
import devices.Phone;
import devices.Car;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

/*        Creatures.Animal pet = new Creatures.Animal("canis");
        pet.feed();
        pet.takeForAWalk();
        pet.takeForAWalk();*/

/*        Creatures.Human Marek = new Creatures.Human();

        Car BMW = new Car("BMW","E36", "Nardo Grey", 1.6, 3000.00);
        Car BMW12 = new Car("BMW","E36", "Nardo Grey", 1.6, 3000.00);

        Marek.setSalary(3010.00);
        Marek.getSalary();
        Marek.setCar(BMW);

        System.out.println(BMW.equals(BMW12));
        System.out.println(BMW);
        System.out.println(BMW12);*/

/*        Phone phone = new Phone("Samsung", "Galaxy 22", 2022, true);
        phone.turnOn();*/
/*
        Car BMW = new Car("BMW","E36", "Nardo Grey", 1.6, 3000.00);
        Human seller = new Human();
        Human buyer = new Human();
        seller.setCash(1500.00);
        buyer.setCash(3400.00);
        BMW.sell(seller,buyer,1000.00);
        System.out.println(seller.getCash() + " " + buyer.getCash());
        System.out.println(seller.getCar() + " " + buyer.getCar());*/
        List<String> apps = new ArrayList<String>();
        apps.add("TikTok");
        apps.add("Youtube");
        Human Marek = new Human();
        Phone nokia = new Phone("Nokia", "3310", 1980, true);
        nokia.installAnnApp(apps);
    }
}