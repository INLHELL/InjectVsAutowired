package test7.type.qualifier.field;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import test7.type.qualifier.field.model.Person;

import javax.inject.Inject;

@Component
@Lazy // To see error after context setup
public class InjectAnnotation {


    @Inject
    @Qualifier("employee")
    private Person organization;

    @Override
    public String toString() {
        return "InjectAnnotation{" +
                "organization=" + organization +
                '}';
    }
}
