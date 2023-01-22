package creatures;

import Main.Salleable;
import devices.Car;
import devices.Phone;

import java.util.Date;

public class Human implements Salleable {
    public Animal pet;
    public Car car;
    public Phone phone;
    Double salary;
    Date dateOfChange = new Date();
    public double Cash;
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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if(this.salary>car.value){
            this.car = car;
            System.out.println("Car was bought by cash");
        } else if(this.salary> car.value/12){
            this.car=car;
            System.out.println("devices.Car was bought on loan");
        }else {
            System.out.println("You know what to do, go find job");
        }
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Nie można handlować ludźmi!");
    }
}
