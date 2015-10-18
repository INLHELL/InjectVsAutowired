package test8.bad.qualifier;

import model.Party;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // To see error after context setup
public class AutowiredAnnotation {

    @Autowired
    @Qualifier("bad")
    private Party person;


    @Override
    public String toString() {
        return "AutowiredAnnotation{" +
                "person=" + person +
                '}';
    }
}
