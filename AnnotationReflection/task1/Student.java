package AnnotationReflection.task1;
@GradeInfo(teacher = "Nicat", maxScore = 100)
public class Student {


    private String name;
    private int score;

    // constructor, getter
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
