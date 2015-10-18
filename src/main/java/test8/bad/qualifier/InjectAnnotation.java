package test8.bad.qualifier;

import model.Party;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
@Lazy // To see error after context setup
public class InjectAnnotation {


    @Inject
    @Qualifier("bad")
    private Party person;

    @Override
    public String toString() {
        return "InjectAnnotation{" +
                "person=" + person +
                '}';
    }
}
