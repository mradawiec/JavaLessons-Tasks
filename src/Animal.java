public class Animal {
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

    void feed() {
        weight = weight + 1.5;
        System.out.println("Weight after feeding: " + weight);
    }

    void takeForAWalk() {

        if (weight > 0) {
            weight -= 1.5;
            System.out.println("Weight after walk: " + weight);
        } else if (weight < 0.01) {
            System.out.println("Pet has died");
        }
    }
}
