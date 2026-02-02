package az.edu.lesson6.Parking;

public class Parking {
    Car[] cars = new Car[5];
    int count=0;

    public void addCar(Car car){
        if (count < cars.length) {
            cars[count] = car;
            count++;
        }
        else {
            System.out.println("Parking full");
        }
    }

    public void showCars() {
        for(int i=0; i<count; i++){
            System.out.println("Plate: " + cars[i].plateNumber);
            System.out.println("Brand: " + cars[i].brand);
        }
    }
}
