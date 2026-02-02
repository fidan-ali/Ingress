package az.edu.lesson6.Exam;

public class MainExam {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Fidan";
        s1.surname = "Aliyeva";
        s1.grades = new int[]{90, 85, 88, 92, 95};

        Student s2 = new Student();
        s2.name = "Laman";
        s2.surname = "Aliyeva";
        s2.grades = new int[]{78, 80, 75, 82, 79};

        Student s3 = new Student();
        s3.name = "Fariz";
        s3.surname = "Huseynov";
        s3.grades = new int[]{88, 90, 91, 89, 87};

        Student[] students = {s1, s2, s3};

        double maxAverage = 0;
        Student bestStudent = null;

        for (int i = 0; i < students.length; i++) {
            double avg = students[i].calculateAverage();
            System.out.println(
                    students[i].name + " " + students[i].surname +
                            " gpa: " + avg
            );

            // Bonus: ən yüksək ortalama
            if (avg > maxAverage) {
                maxAverage = avg;
                bestStudent = students[i];
            }
        }

        System.out.println("\nƏn yüksək ortalamaya malik tələbə:");
        System.out.println(
                bestStudent.name + " " + bestStudent.surname +
                        " → " + maxAverage
        );
    }
}
//static-metaspace memory