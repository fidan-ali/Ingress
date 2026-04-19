import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = n;
        int revnum = 0;
        int d;
        while(num != 0){
            d = num % 10;
            revnum = revnum * 10 + d;
            num = num / 10;
        }
        System.out.println("Reverse of given number is " + revnum);
        if(n == revnum){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not a Palindrom");
        }
    }
}
