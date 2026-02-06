package TransportSystem;

public class TransportMain {
    public static void main(String[] args) {
        //1st task
        Transport car = new Car();
        car.maxSpeed = 100;
        car.move();

        Transport train = new Train();
        train.maxSpeed = 100;
        train.move();

        Transport airplane = new Airplane();
        airplane.maxSpeed = 100;
        airplane.move();

    }
}
