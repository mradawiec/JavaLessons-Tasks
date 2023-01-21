public class Car {
        final String model;
        final String producer;
        String color;
        Double engineCapacity;


        public Car(String producer, String model , String color, Double engineCapacity) {
            this.model = model;
            this.producer = producer;
            this.color = color;
            this.engineCapacity = engineCapacity;
        }
        void newRide(){
            System.out.println("Your new car is: " + producer + " " + model + " " + "color: " + color + ", and has engine capacity: " + engineCapacity);
        }
}

