package test5.qualified.name.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("personBean")
public class Person implements Party {
    @Override
    public String toString() {
        return "Person{}";
    }
}
