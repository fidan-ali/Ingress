package task2;

import javax.management.StringValueExp;
import java.lang.invoke.StringConcatFactory;
import java.util.Objects;
import java.util.UUID;

public class Car {
    String plateNumber;
    String brand;
    CarType carType;

    public String getBrand() {
        return brand;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Car(String brand, CarType carType) {
        this.plateNumber = UUID.randomUUID().toString();
        this.brand = brand;
        this.carType = carType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(plateNumber, car.plateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(plateNumber);
    }
    @Override
    public String toString() {
        return "Car{Plate number=" + plateNumber + ", Brand='" + brand + "', Car type=" + carType + "}";
    }
}
