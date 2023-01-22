package creatures;

import Main.Salleable;

public class Animal implements Salleable{
    final String species;
    private Double weight;
    double DEFAULT_WEIGHT = 3.0;
    double DEFAULT_CAT_WEIGHT = 3.0;
    double DEFAULT_ELEPHANT_WEIGHT = 100.0;
    double DEFAULT_DOG_WEIGHT = 3.0;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "canis" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "felis" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "elephant" -> this.weight = DEFAULT_ELEPHANT_WEIGHT;
            default -> this.weight = DEFAULT_WEIGHT;
        }
    }

    public void feed() {
        weight = weight + 1.5;
        System.out.println("Weight after feeding: " + weight);
    }

    public void takeForAWalk() {

        if (weight > 0) {
            weight -= 1.5;
            System.out.println("Weight after walk: " + weight);
        } else if (weight < 0.01) {
            System.out.println("Pet has died");
        }
    }

    @Override
    public String toString() {
        return "Creatures.Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", DEFAULT_WEIGHT=" + DEFAULT_WEIGHT +
                ", DEFAULT_CAT_WEIGHT=" + DEFAULT_CAT_WEIGHT +
                ", DEFAULT_ELEPHANT_WEIGHT=" + DEFAULT_ELEPHANT_WEIGHT +
                ", DEFAULT_DOG_WEIGHT=" + DEFAULT_DOG_WEIGHT +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
    if(this.equals(seller.getPet()) && buyer.getCash() >= price){
        seller.setCash(seller.getCash()+price);
        buyer.setCash(buyer.getCash()-price);
        buyer.setPet(this);
        seller.setPet(null);
        System.out.println("Transakcja powiodla sie");
    }else {
        System.out.println("Transakcja sie nie powiodla");
    }
    }
}
