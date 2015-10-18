package test2.field.name;

import model.Party;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // To see error after context setup
public class AutowiredAnnotation {

    @Autowired
    private Party person;

    @Override
    public String toString() {
        return "AutowiredAnnotation{" +
                "person=" + person +
                '}';
    }
}
