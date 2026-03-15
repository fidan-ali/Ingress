package Task2;

import java.util.HashMap;
import java.util.Map;

public class StudentManager {
    public Map<Integer, String> studentList = new HashMap<>();
    public void addStudent(Student student){
        if (studentList.containsKey(student.id)) {
            System.out.println("Student with this ID already exists!");
        } else {
            studentList.put(student.id, student.name);
            System.out.println("Student added successfully.");
        }
    }
    public void removeStudent(int id){
        if (studentList.remove(id) != null) {
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }
    public String findStudentById(int id){
            return studentList.get(id);
    }
    public void printAllStudents(){
        for (Map.Entry<Integer, String> entry : studentList.entrySet()) {
            System.out.println("Id: " + entry.getKey() + " Name: " + entry.getValue());
        }
    }
}
