package Transport;

public class Vehicle {
    String model;
    int maxSpeed;
    int capacity;

    public Vehicle(String model, int maxSpeed, int capacity){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
    }

    public void displayInfo(){
        System.out.println("Model: " + model +
                            "Max Speed: " + maxSpeed +
                            "Capacity: " + capacity);
    }
}
