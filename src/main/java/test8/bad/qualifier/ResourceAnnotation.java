package test8.bad.qualifier;

import model.Party;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Lazy // To see error after context setup
public class ResourceAnnotation {

    @Resource
    @Qualifier("bad")
    private Party person;

    @Override
    public String toString() {
        return "ResourceAnnotation{" +
                "person=" + person +
                '}';
    }
}
