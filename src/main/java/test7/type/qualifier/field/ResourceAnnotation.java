package test7.type.qualifier.field;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import test7.type.qualifier.field.model.Person;

import javax.annotation.Resource;

@Component
@Lazy // To see error after context setup
public class ResourceAnnotation {

    @Resource
    @Qualifier("employee")
    private Person organization;

    @Override
    public String toString() {
        return "ResourceAnnotation{" +
                "organization=" + organization +
                '}';
    }
}
