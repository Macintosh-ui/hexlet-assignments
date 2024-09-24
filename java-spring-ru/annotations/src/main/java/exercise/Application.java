package exercise;

import exercise.model.Address;
import exercise.annotation.Inspect;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {
        var address = new Address("London", 12345678);

        // BEGIN
        Class<?> clazz = address.getClass();
        for (var method : clazz.getDeclaredMethods()) {
            var annotation = method.getAnnotation(Inspect.class);
            if (annotation != null) {
                System.out.println("Method " + method.getName() + " returns a value of type " + 
                        method.getReturnType().getSimpleName());
            }
        }
        // END
    }
}
