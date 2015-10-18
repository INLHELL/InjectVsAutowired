package test4.name.qualifier;

import model.Party;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Lazy // To see error after context setup
public class ResourceAnnotation {

    @Resource
    @Qualifier("person")
    private Party party;

    @Resource
    @Qualifier("person")
    private Party organization;


    @Override
    public String toString() {
        return "ResourceAnnotation{" +
                "party=" + party +
                ", organization=" + organization +
                '}';
    }
}
