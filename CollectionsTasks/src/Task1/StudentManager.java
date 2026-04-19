package Task1;

import java.rmi.StubNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class StudentManager {
    List<Student> students = new LinkedList<>();
    public void addStudent(Student s){
        students.add(s);
        System.out.println("Student " + s + " added.");
    }

    public void removeStudent(int id){
        for (Student s : students){
            if(s.getId() == id){
                students.remove(s);
            }
        }
        System.out.println("Student " + id + " removed.");
    }

    public Student findStudent(int id){
        for(Student s : students){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }
    public void printAllStudents(){
        for(Student s : students){
            System.out.println(s);
            }
    }
}
