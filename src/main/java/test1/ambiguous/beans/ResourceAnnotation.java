package test1.ambiguous.beans;

import model.Party;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Lazy // To see error after context setup
public class ResourceAnnotation {

    @Resource
    private Party party;
}
