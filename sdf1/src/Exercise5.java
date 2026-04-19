public class Exercise5 {
    public static void main(String[] args){
        int a = 3;
        int b = 5;
        int c = 4;
        double s;
        double area;

        if(a+b<c || a+c<b || b+c<a){
            System.out.println("Triangle cannot be formed");
        }
        else{
            s=(a+b+c) / 2.0;
            area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area is " + area);
        }
    }
}
