@FunctionalInterface
interface Operation {
    int apply(int a, int b);
}
public class LambdaTask3 {
    public static void main(String[] args) {

        // toplama lambda
        Operation addition = (a, b) -> a + b;

        // çıxma lambda
        Operation subtraction = (a, b) -> a - b;

        // vurma lambda
        Operation multiplication = (a, b) -> a * b;

        System.out.println("Add: " + addition.apply(10,5));
        System.out.println("Çıxma: " + subtraction.apply(10, 5));
        System.out.println("Vurma: " + multiplication.apply(10, 5));

    }

}
