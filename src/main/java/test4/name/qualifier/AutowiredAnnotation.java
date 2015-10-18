package test4.name.qualifier;

import model.Party;
import model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // To see error after context setup
public class AutowiredAnnotation {

    @Autowired
    @Qualifier("person")
    private Party organization;


    @Override
    public String toString() {
        return "AutowiredAnnotation{" +
                "organization=" + organization +
                '}';
    }
}
