package test3b.name.vs.type;

import model.Person;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Lazy // To see error after context setup
public class ResourceAnnotation {

    @Resource
    private Person organization;


    @Override
    public String toString() {
        return "ResourceAnnotation{" +
                "organization=" + organization +
                '}';
    }
}
