package AnnotationReflection.task2;

public class MainT2 {
    public static void main(String[] args) {
        Student s = new Student(null, 20, null);
        SimpleValidator.validate(s);
    }
}
