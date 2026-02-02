package az.edu.lesson6.Student;

public class MainStudentArray {
    public static void main(String[] args){
        Student[] students = new Student[3];

        students[0] = new Student();
        students[0].name="Gulnur";
        students[0].grade=100;

        students[1] = new Student();
        students[1].name="Laman";
        students[1].grade=95;

        students[2] = new Student();
        students[2].name="Lale";
        students[2].grade=95;

        printStudents(students);


    }
    public static void printStudents(Student[] students){
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].name + " : " + students[i].grade);
        }
    }
}
