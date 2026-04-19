package L19;

import java.lang.reflect.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainL19 {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Student student = new Student(1, "Fidan", "Aliyeva");
        Class<?> studentClass= student.getClass();

//        for(Constructor constructor : studentClass.getDeclaredConstructors()){
//            System.out.println("constructor name = " + constructor.getName());
//            System.out.println("Count = " + constructor.getParameterCount());
//            int modifier = constructor.getModifiers();
//            System.out.println("Modifier = " + modifier);
//            System.out.println("Modifier = " + Modifier.toString(modifier));
//            System.out.println("---------------");
//        }

//        for(Constructor constructor : studentClass.getDeclaredConstructors()){
//            if(constructor.getParameterCount() == 3){
//                L19.Student student1 =
//                        (L19.Student) constructor.newInstance(2, "Murad", "Haciyev");
//                System.out.println(student1.toString());
//            }

//            for(Constructor constructor : studentClass.getDeclaredConstructors()){
//                if(constructor.getParameterCount() == 0){
//                    constructor.setAccessible(true);
//                    L19.Student student1 =
//                            (L19.Student) constructor.newInstance();
//                    System.out.println(student1.toString());
//                }

//            for(Field field : studentClass.getDeclaredFields()){
//                System.out.println(field.getName());
//            }
        for(Method method : studentClass.getDeclaredMethods()){
            //basqa bir classda bir diger classin private methodunu reflection vasitesi ile calisdirdiq
            if(method.getModifiers() == 0) {

                if(method.getModifiers() == 2){
                    method.setAccessible(true);
                }
                System.out.println(method.getName());
                System.out.println(Modifier.toString(method.getModifiers()));
                method.invoke(student);
            }
        }

    }
}