package test3b.name.vs.type;

import model.Person;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
@Lazy // To see error after context setup
public class InjectAnnotation {


    @Inject
    private Person organization;

    @Override
    public String toString() {
        return "InjectAnnotation{" +
                "organization=" + organization +
                '}';
    }
}
