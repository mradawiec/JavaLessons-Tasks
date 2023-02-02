package creatures;

import Main.Salleable;
import devices.Car;
import devices.Device;
import devices.Phone;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Human implements Salleable {
    public String name;
    public Animal pet;
    public Car[] garage;
    public Phone phone;
    Double salary;
    Date dateOfChange = new Date();
    public double Cash;
    final static int DEFAULT_PARKING_SPACES = 3;
    public Human(String name) {
        this.name = name;
        this.garage = new Car[DEFAULT_PARKING_SPACES];
    }
    public Human(String name, int garageSize) {
        this.name = name;
        this.garage = new Car[garageSize];
    }

    public Double getSalary() {
        System.out.println("Last info about seeing your salary was: " +dateOfChange+ "and salary was: "+ salary + "\n");
        return salary;
    }

    public void setSalary(double salary){
        if (salary<0){
            System.out.println("Salary must be higher than 0 pesos");
        }else if(salary>0){
            this.salary = salary;
            System.out.println("New salary sent to HR department");
            System.out.println("Need to collect an annex to the contract from Mrs. Hania of dept. HR");
            System.out.println("ZUS and US already now about new salary");
            System.out.println("Well done, your new salary is: " + salary + "\n");
        }
    }

    public void setGarage(Car car, int parkingSpot) {
        garage[parkingSpot] = car;
    }
    public void addCarToGarage(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = car;
                break;
            }
        }
    }

    public void removeCarFromGarage(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
                break;
            }
        }
    }

    public boolean hasFreeSpaceInGarage() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public boolean hasCarInGarage(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                return true;
            }
        }
        return false;
    }
    public double carsValue(){
        double value = 0.0;
        for (Car car: garage) {
            if (car != null)
                value += car.getValue();
        }
        return value;
    }
    public void sortCarsByDate() {
        Arrays.sort(garage, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getYearOfProduction() - o2.getYearOfProduction();
            }
        });
    }

    @Override
    public String toString() {
        return "Creatures.Human{" +
                "salary=" + salary +
                ", dateOfChange=" + dateOfChange +
                '}';
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public double getCash() {
        return Cash;
    }

    public void setCash(double cash) {
        Cash = cash;
    }

    public Car[] getGarage() {
        return garage;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception{
        new Exception("Nie można handlować ludźmi!");
    }
}
