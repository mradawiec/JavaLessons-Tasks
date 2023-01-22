package creatures;

import Main.Salleable;

public abstract class Animal extends Pet implements Salleable, Feedable{

    public Animal(String species) {
        super(species);
        switch (species) {
            case "canis" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "felis" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "elephant" -> this.weight = DEFAULT_ELEPHANT_WEIGHT;
            default -> this.weight = DEFAULT_WEIGHT;
        }
    }

    @Override
    public void feed() {
        this.weight += 0.5;
        System.out.println("Peet feeded");
    }

    @Override
    public Double getWeight() {
        return this.weight;
    }

    public void takeForAWalk(double distance){
        if(weight>0) {
            weight -= 1.5;
            if(distance>2.0){
                weight -=2.0;
            }
            else
            {
                weight -= 1.0;
            }
            System.out.println("Weight after walk: " + weight + "walk with distance:" +distance);
        } else if(weight<0.01)
        {
            System.out.println("Peet has died :(");
        }
    }
    public void takeForAWalk(double distance, boolean czyBiegniemy){
        if(weight>0) {
            weight -= 1.5;
            if(distance>2.0 && czyBiegniemy == true){
                weight -=3.0;
            }
            else if(distance>2.0 && czyBiegniemy == false)
            {
                weight -= 1.0;
            }
            System.out.println("Weight after walk: " + weight + "walk with distance:" +distance);
        } else if(weight<0.01)
        {
            System.out.println("Peet has died :(");
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
