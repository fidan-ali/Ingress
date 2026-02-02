public class MainStudent {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Fidan";
        s1.surname = "Aliyeva";
        s1.age = 19;

        Student s2 = new Student();
        s2.name = "Laman";
        s2.surname = "Alizada";
        s2.age = 19;

        System.out.println("Student 1: " + s1.name + " " + s1.surname + " " + s1.age);
        System.out.println("Student 2: " + s2.name + " " + s2.surname + " " + s2.age);
    }
}
