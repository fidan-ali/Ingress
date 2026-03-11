import java.util.List;

public class LambdaTask1 {

    public static void main(String[] args) {

        List<String> names = List.of(
                "Ali",
                "Murad",
                "Nigar",
                "Aysel",
                "Rauf"
        );

        // 1. Lambda ilə bütün adları çap et
        System.out.println("butun adlar: ");
        names.forEach(name -> System.out.println(name));

        // 2. 4 hərfdən böyük adları çap et
        System.out.println("4 herfden boyuk adlar: ");
        names.stream()
                .filter(name -> name.length() > 4)
                .forEach(name -> System.out.println(name));

        // 3. "A" ilə başlayan adları çap et
        System.out.println("A ile baslayan adlar: ");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));

    }
}