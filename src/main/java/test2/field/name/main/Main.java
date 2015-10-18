package test2.field.name.main;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test2.field.name.AutowiredAnnotation;
import test2.field.name.InjectAnnotation;
import test2.field.name.ResourceAnnotation;

public class Main {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        try {
            final ResourceAnnotation bean = context.getBean(ResourceAnnotation.class);
            System.out.println(bean);
        } catch (BeanCreationException e){
            System.out.println("Injection to Field via @Resource Annotation Failed");
        }

        try {
            final AutowiredAnnotation bean = context.getBean(AutowiredAnnotation.class);
            System.out.println(bean);
        } catch (BeanCreationException e){
            System.out.println("Injection to Field via @Autowired Annotation Failed");
        }

        try {
            final InjectAnnotation bean = context.getBean(InjectAnnotation.class);
            System.out.println(bean);
        } catch (BeanCreationException e){
            System.out.println("Injection to Field via @Inject Annotation Failed");
        }
    }
}
