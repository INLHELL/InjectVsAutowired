package test2.field.name;

import model.Party;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
@Lazy // To see error after context setup
public class InjectAnnotation {


    @Inject
    private Party person;

    @Override
    public String toString() {
        return "InjectAnnotation{" +
                "person=" + person +
                '}';
    }
}
