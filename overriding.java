

class Vehicle {
    
    void start() {
        System.out.println("Vehicle is starting");
    }
}


class Car extends Vehicle {
    
    
    void start() {
        System.out.println("Car is starting");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();

        myVehicle.start(); 
        myCar.start();     
    }
}
