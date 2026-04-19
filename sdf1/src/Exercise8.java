public class Exercise8 {
    public static void main(String[] args){
        double a = 1, b = 2, c = 1, disc, r1, r2, real, img;
        if(a==0){
            System.out.println("Linear equation with 1 root");
            System.out.println("The root is " + (-c/b));
        }
        else{
            disc=b*b-4*a*c;
            if(disc == 0){
                r1 = -b / (2*a);
                System.out.println("Real and equal roots");
                System.out.println("r1 = " + r1 +"\n r2 " + r1);
            }
            else if(disc>0){
                r1 = (-b + Math.sqrt(disc)) / (2 * a);
                r2 = (-b - Math.sqrt(disc)) / (2 * a);
                System.out.println("Real and distinct");
                System.out.println("r1 = " + r1 + "\nr2 = " + r2);
            }
            else{
                real = -b / (2 * a);
                img = Math.sqrt(-disc) / (2 * a);
                System.out.println("The roots are imaginary");
                System.out.println("r1 = " + real + " + " + img + "i");
                System.out.println("r1 = " + real + " - " + img + "i");
            }
        }
    }
}
