public class Main {
    public static void main(String[] args) {

/*        Animal pet = new Animal("canis");
        pet.feed();
        pet.takeForAWalk();
        pet.takeForAWalk();*/

        Human Marek = new Human();

        Car BMW = new Car("BMW","E36", "Nardo Grey", 1.6, 3000.00);

        Marek.setSalary(3010.00);
        Marek.getSalary();
        Marek.setCar(BMW);

    }
}