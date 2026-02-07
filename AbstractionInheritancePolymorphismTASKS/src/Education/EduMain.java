package Education;

import java.util.ArrayList;
import java.util.List;

public class EduMain {
    public static void main(String[] args){

        List<Course> arrayList = new ArrayList<>();
        arrayList.add(new InteractiveTest());
        arrayList.add(new LiveClass());
        arrayList.add(new VideoCourse());

        for(Course course : arrayList){
            course.start();
        }

    }
}
