package Main;

import creatures.Human;
import devices.Car;
public class Main {
    public static void main(String[] args) {
        Car BMW = new Car("BMW", "E36","Nardo grey",3000.00,1999);
        Car Mazda = new Car("Mazda", "MX-5", "Red", 5000.00,2001);
        Human seller = new Human("Marek", 2);
        Human buyer = new Human("Tadek");
        seller.setCash(10000.00);
        buyer.setCash(10000.00);
        seller.setGarage(BMW,0);
        seller.setGarage(Mazda,1);
        try {
            BMW.sell(seller,buyer,3000.00);
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}