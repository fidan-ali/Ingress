package az.edu.lesson6.Exam;

public class Student {
    String name;
    String surname;
    int[] grades = new int[5];
    
    public double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}
