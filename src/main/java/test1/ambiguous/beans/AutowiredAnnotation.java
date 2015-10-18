package test1.ambiguous.beans;

import model.Party;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy // To see error after context setup
public class AutowiredAnnotation {

    @Autowired
    private Party party;
}
