package Task2;

public class Task2Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student(1, "Ali", 90);
        Student s2 = new Student(2, "Leyla", 85);
        Student s3 = new Student(3, "Murad", 75);
        Student s4 = new Student(1, "Nigar", 88); // duplicate id

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        manager.addStudent(s4); // əlavə olunmayacaq

        System.out.println("\nAll students:");
        manager.printAllStudents();

        System.out.println("\nFind student with id 2:");
        System.out.println(manager.findStudentById(2));

        System.out.println("\nRemove student with id 1:");
        manager.removeStudent(1);

        System.out.println("\nStudent after removal:");
        manager.printAllStudents();
    }
}
