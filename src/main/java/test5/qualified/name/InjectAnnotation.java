package test5.qualified.name;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import test5.qualified.name.model.Party;

import javax.inject.Inject;

@Component
@Lazy // To see error after context setup
public class InjectAnnotation {


    @Inject
    @Qualifier("personBean")
    private Party organization;

    @Override
    public String toString() {
        return "InjectAnnotation{" +
                "organization=" + organization +
                '}';
    }
}
