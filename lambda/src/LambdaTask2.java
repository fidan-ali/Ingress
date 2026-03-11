import java.util.List;

public class LambdaTask2 {
    public static void main(String[] args){
        List<Integer> numbers = List.of(5, 10, 15, 20, 25);
        // 1. bütün ədədləri çap et
        System.out.println("butun ededler: ");
        numbers.forEach(number -> System.out.println(number));

        // 2. cüt ədədləri çap et
        System.out.println("cut ededler: ");
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(number -> System.out.println(number));

        // 3. bütün ədədlərin 2 qatını çap et
        System.out.println("ededlerin 2 qati: ");
        numbers.forEach(number -> System.out.println(number*2));
    }
}
