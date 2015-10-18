package test1.ambiguous.beans.main;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test1.ambiguous.beans.AutowiredAnnotation;
import test1.ambiguous.beans.InjectAnnotation;
import test1.ambiguous.beans.ResourceAnnotation;

public class Main {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        try {
            context.getBean(ResourceAnnotation.class);
        } catch (BeanCreationException e){
            System.out.println("Injection to Field via @Resource Annotation Failed");
        }

        try {
            context.getBean(AutowiredAnnotation.class);
        } catch (BeanCreationException e){
            System.out.println("Injection to Field via @Autowired Annotation Failed");
        }

        try {
            context.getBean(InjectAnnotation.class);
        } catch (BeanCreationException e){
            System.out.println("Injection to Field via @Inject Annotation Failed");
        }
    }
}
