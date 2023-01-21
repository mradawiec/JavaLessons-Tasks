public class Car {
        final String model;
        final String producer;
        String color;
        Double engineCapacity;
        Double value;


        public Car(String producer, String model , String color, Double engineCapacity, Double value) {
            this.model = model;
            this.producer = producer;
            this.color = color;
            this.engineCapacity = engineCapacity;
            this.value = value;
        }
        void newRide(){
            System.out.println("Your new car is: " + producer + " " + model + " " + "color: " + color + ", and has engine capacity: " + engineCapacity);
        }
}

