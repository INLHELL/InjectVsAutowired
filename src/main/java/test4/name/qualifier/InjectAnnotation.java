package test4.name.qualifier;

import model.Party;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
@Lazy // To see error after context setup
public class InjectAnnotation {


    @Inject
    @Qualifier("person")
    private Party organization;

    @Override
    public String toString() {
        return "InjectAnnotation{" +
                "organization=" + organization +
                '}';
    }
}
