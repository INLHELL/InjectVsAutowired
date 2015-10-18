package test3b.name.vs.type;

import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // To see error after context setup
public class AutowiredAnnotation {

    @Autowired
    private Person organization;

    @Override
    public String toString() {
        return "AutowiredAnnotation{" +
                "organization=" + organization +
                '}';
    }
}
