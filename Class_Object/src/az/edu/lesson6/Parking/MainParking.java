package az.edu.lesson6.Parking;

public class MainParking {

    public static void main(String[] args) {

        Parking parking = new Parking();

        Car car1 = new Car();
        car1.plateNumber = "10-AB-123";
        car1.brand = "Toyota";

        Car car2 = new Car();
        car2.plateNumber = "20-CD-456";
        car2.brand = "BMW";

        parking.addCar(car1);
        parking.addCar(car2);

        parking.showCars();
    }
}
