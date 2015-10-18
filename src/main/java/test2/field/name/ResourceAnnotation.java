package test2.field.name;

import model.Party;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Lazy // To see error after context setup
public class ResourceAnnotation {

    @Resource(name = "person")
    private Party party;

    @Resource
    private Party person;

    @Override
    public String toString() {
        return "ResourceAnnotation{" +
                "party=" + party +
                ", person=" + person +
                '}';
    }
}
