package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 100; i++){
            numbers.add(random.nextInt(100));
        }
        List<Integer> part1 = numbers.subList(0, 25);
        List<Integer> part2 = numbers.subList(25, 50);
        List<Integer> part3 = numbers.subList(50, 75);
        List<Integer> part4 = numbers.subList(75, 100);

        Thread t1 = new Thread(new NumberProcessor(part1));
        Thread t2 = new Thread(new NumberProcessor(part1));
        Thread t3 = new Thread(new NumberProcessor(part1));
        Thread t4 = new Thread(new NumberProcessor(part1));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
