package creatures;

public class Pet {
    final String species;
    Double weight;
    double DEFAULT_WEIGHT = 3.0;
    double DEFAULT_CAT_WEIGHT = 3.0;
    double DEFAULT_ELEPHANT_WEIGHT = 100.0;
    double DEFAULT_DOG_WEIGHT = 3.0;

    public Pet(String species) {
        this.species = species;
    }
}
