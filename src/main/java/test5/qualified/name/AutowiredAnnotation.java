package test5.qualified.name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import test5.qualified.name.model.Party;

@Component
@Lazy // To see error after context setup
public class AutowiredAnnotation {

    @Autowired
    @Qualifier("personBean")
    private Party organization;


    @Override
    public String toString() {
        return "AutowiredAnnotation{" +
                "organization=" + organization +
                '}';
    }
}
