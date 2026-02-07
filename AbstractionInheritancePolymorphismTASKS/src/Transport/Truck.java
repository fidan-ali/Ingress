package Transport;

public class Truck extends Vehicle{

    public Truck(String model, int maxSpeed, int capacity){
        super(model, maxSpeed, capacity);
    }

    public void displayInfo(double weight) {
        System.out.println("Model: " + model +
                "Max Speed: " + maxSpeed +
                "Capacity: " + capacity);
        loadCargo(weight);
    }

    public void loadCargo(double weight){
        System.out.println("This truck is carrying " + weight + "tons.");
    }
}
