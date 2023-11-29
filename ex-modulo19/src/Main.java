import java.lang.annotation.Annotation;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Annotation[] annotatedParams = Cliente.class.getAnnotations();
        System.out.println(Arrays.toString(annotatedParams));
    }
}