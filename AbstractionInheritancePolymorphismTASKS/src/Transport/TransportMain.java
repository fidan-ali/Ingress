package Transport;

import Payment.Payment;

import java.util.Scanner;

public class TransportMain {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("hadshasd",150 , 300);
        Truck truck = new Truck("jhfdkj", 100, 200);
        vehicle.displayInfo();
        truck.displayInfo(200);

    }
}
