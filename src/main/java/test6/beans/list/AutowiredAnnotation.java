package test6.beans.list;

import model.Party;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Lazy // To see error after context setup
public class AutowiredAnnotation {

    @Autowired
    private List<Party> parties;


    @Override
    public String toString() {
        return "AutowiredAnnotation{" +
                "parties=" + parties +
                '}';
    }
}
