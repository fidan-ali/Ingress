package AnnotationReflection.task2;
import java.lang.reflect.Field;
public class SimpleValidator {
    public static void validate(Object obj) {

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Required.class)) {
                field.setAccessible(true);
                try {
                    if (field.get(obj) != null) {
                        System.out.println("Field " + field.getName());
                    }
                }
                catch (Exception e) {
                    System.out.println("Cannot access field: ");
                }
            }
        }
    }
}
