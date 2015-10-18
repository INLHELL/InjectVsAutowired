package test3.field.type;

import model.Party;
import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // To see error after context setup
public class AutowiredAnnotation {

    @Autowired
    private Person party;

    @Override
    public String toString() {
        return "AutowiredAnnotation{" +
                "party=" + party +
                '}';
    }
}
