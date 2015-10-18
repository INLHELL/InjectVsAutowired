package test5.qualified.name;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import test5.qualified.name.model.Party;

import javax.annotation.Resource;

@Component
@Lazy // To see error after context setup
public class ResourceAnnotation {

    @Resource
    @Qualifier("personBean")
    private Party party;

    @Resource
    @Qualifier("personBean")
    private Party organization;


    @Override
    public String toString() {
        return "ResourceAnnotation{" +
                "party=" + party +
                ", organization=" + organization +
                '}';
    }
}
