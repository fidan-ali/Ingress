import java.util.Scanner;
public class ShiftLettersinString {
    public static void main(String[] args) { // a-z ---> 97-122 in ascii
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = Integer.parseInt(scanner.next());

        StringBuilder res = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch = (char) (str.charAt(i) + n);

            if (ch > 'z') {
                ch = (char) (ch - 26); // asciide z-a=122-97=26(eng herf sayi)
            }
            if (ch < 'a') {
                ch = (char) (ch + 26);
            }
            res.append(ch);

        }
        System.out.println(res.toString());

    }
}