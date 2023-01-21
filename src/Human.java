import devices.Car;

import java.util.Date;

public class Human {
    public Animal pet;
    private Car car;
    Double salary;
    Date dateOfChange = new Date();
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
            System.out.println("devices.Car was bought by cash");
        } else if(this.salary> car.value/12){
            this.car=car;
            System.out.println("devices.Car was bought on loan");
        }else {
            System.out.println("You know what to do, go find job");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "salary=" + salary +
                ", dateOfChange=" + dateOfChange +
                '}';
    }
}
