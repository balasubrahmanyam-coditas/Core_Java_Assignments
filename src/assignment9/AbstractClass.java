package assignment9;

abstract class  Vehicle{
    public abstract void engine();
}
class Car extends Vehicle{
    public void engine(){
        System.out.println("Car has good engine");
    }
}
class Truck extends Vehicle{
    public void engine(){
        System.out.println("Truck has bad engine");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Truck truck = new Truck();
        Car car = new Car();
        truck.engine();
        car.engine();


    }
}
/*
Truck has bad engine
Car has good engine

 */