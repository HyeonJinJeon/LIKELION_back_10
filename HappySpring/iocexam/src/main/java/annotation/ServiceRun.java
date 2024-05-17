package annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ServiceRun {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] declaredMethods= Service.class.getDeclaredMethods();

        Service service = new Service();

        for(Method method : declaredMethods){
            if(method.isAnnotationPresent(PrintAnnotation.class)){
                System.out.println("[[[[[[[[[" + method.getName() + "]]]]]]]]]");

                PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

                for(int i = 0; i < printAnnotation.number(); i++){
                    System.out.print(printAnnotation.value());
                }
                System.out.println();
            }
            method.invoke(service);
        }
    }
}
