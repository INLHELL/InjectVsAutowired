package test1.ambiguous.beans;

import model.Party;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
@Lazy // To see error after context setup
public class InjectAnnotation {

    @Inject
    private Party party;
}
