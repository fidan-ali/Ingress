import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws IllegalAccessException{
        Class<?> clazz = obj.getClass();
        for(Field field : clazz.getDeclaredFields()) {
            if(field.isAnnotationPresent((MinValue.class))) {
                MinValue minValueAnnotation = field.getAnnotation(MinValue.class);
                field.setAccessible(true);
                int currValue = (int) field.get(obj);

                if(currValue < minValueAnnotation.value()){
                    throw new IllegalAccessException("18- dur");
                }

            }
        }
    }
}
