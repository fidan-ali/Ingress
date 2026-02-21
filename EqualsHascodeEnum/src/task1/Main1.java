package task1;

public class Main1 {
    public static void main(String[] args){
        Student s1 = new Student(1, "Aysel", Grade.A);
        Student s2 = new Student(2, "Kamran", Grade.B);
        Student s3 = new Student(1, "Nigar", Grade.C);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("\ns1 == s2 ? " + s1.equals(s2));
        System.out.println("s1 == s3 ? " + s1.equals(s3));
        System.out.println("s2 == s3 ? " + s2.equals(s3));
    }
}
