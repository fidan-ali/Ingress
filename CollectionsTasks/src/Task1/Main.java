package Task1;

public class Main {
    public static void main(String[] args){
        StudentManager manager = new StudentManager();

        Student s1 = new Student(1,"Fidan", 95);
        Student s2 = new Student(2,"Murad", 98);
        Student s3 = new Student(3,"Hikmat", 92);

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s2);

        System.out.println("\nAll students: ");
        manager.printAllStudents();

        System.out.println("\nFinding student with id 2:");
        System.out.println(manager.findStudent(2));

        System.out.println("\nRemoving student with id 1:");
        manager.removeStudent(3);

        System.out.println("\nAll students after removal:");
        manager.printAllStudents();
    }
}
