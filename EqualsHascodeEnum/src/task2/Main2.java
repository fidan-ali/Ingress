package task2;
import java.util.UUID;

public class Main2 {
    public static void main(String[] args){
        Car car1 = new Car("A", CarType.SEDAN);
        Car car2 = new Car("A", CarType.TRUCK);
        Car car3 = new Car("B", CarType.SUV);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        if(car1.equals(car2)){
            System.out.println("Bu maşın artıq mövcuddur.");
        }
        else{
            System.out.println("Yeni maşın əlavə oluna bilər.");
        }

        if(car1.equals(car3)){
            System.out.println("Bu maşın artıq mövcuddur.");
        }
        else{
            System.out.println("Yeni maşın əlavə oluna bilər.");
        }

        if(car2.equals(car3)){
            System.out.println("Bu maşın artıq mövcuddur.");
        }
        else{
            System.out.println("Yeni maşın əlavə oluna bilər.");
        }

    }
}
