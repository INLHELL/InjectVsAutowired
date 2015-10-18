package test6.beans.list;

import model.Party;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

@Component
@Lazy // To see error after context setup
public class InjectAnnotation {


    @Inject
    private List<Party> parties;

    @Override
    public String toString() {
        return "InjectAnnotation{" +
                "parties=" + parties +
                '}';
    }
}
