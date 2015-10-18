package test3.field.type;

import model.Person;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
@Lazy // To see error after context setup
public class InjectAnnotation {


    @Inject
    private Person party;

    @Override
    public String toString() {
        return "InjectAnnotation{" +
                "party=" + party +
                '}';
    }
}
