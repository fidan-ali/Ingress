import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int d;
        int num = n;
        while(num != 0){
            d = num % 10;
            sum+=d;
            num=num/10;
        }
        System.out.println("Sum of digits = " + sum);
    }
}
