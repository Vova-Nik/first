package Chapter12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val() default 128;
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Annotation What: Annotation for class")
@MyAnno(str = "Annottation MyAnno for class")
public class StudyAnnotations {

    @What(description = "Annotation What: Annotation for method")
    @MyAnno(str = "Annottation MyAnno for method")
    public void showAnnotations() {
        StudyAnnotations ob = new StudyAnnotations();
        try {
            Annotation[] annos = ob.getClass().getAnnotations();
            System.out.println("All annotations for class StudyAnnotations:");
            for (Annotation a : annos) {
                System.out.println(a);
            }
            System.out.println();

            Method m = ob.getClass().getMethod("showAnnotations");
            annos = m.getAnnotations();
            System.out.println("All annotations for method showAnnotations:");
            for(Annotation a: annos)
                System.out.println(a);

        } catch (NoSuchMethodException exc) {
            System.out.println("NoSuchMethodException exception arise");
        }

    }

    public void exec() {
        showAnnotations();
    }

}
