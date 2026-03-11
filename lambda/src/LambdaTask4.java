import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaTask4 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Murad", "Ali", "Rauf", "Nigar", "Aysel"));

        // 1. əlifba sırası ilə sort edin
        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("Əlifba sırası: " + names);

        // 2. əks (reverse) sırada sort edin
        names.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Əks sıra: " + names);

        // 3. Uzunluğuna görə sort
        names.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("Uzunluğa görə: " + names);
    }
}