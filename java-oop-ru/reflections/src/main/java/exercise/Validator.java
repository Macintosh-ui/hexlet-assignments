package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// BEGIN
public class Validator {

    public static List<String> validate(Object object){

        var fields = new ArrayList<>(List.of(object.getClass().getDeclaredFields()));
        var notNullFields = new ArrayList<Field>();
        var result = new ArrayList<String>();

        for (var field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                notNullFields.add(field);
            }
        }

        for (var field : notNullFields) {
            try {
                field.setAccessible(true);
                if(field.get(object) == null) {
                    result.add(field.getName());
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        return result;
    }
}
// END
