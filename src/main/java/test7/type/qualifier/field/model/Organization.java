package test7.type.qualifier.field.model;

import org.springframework.stereotype.Component;

@Component
public class Organization implements Party {
    @Override
    public String toString() {
        return "Organization{}";
    }
}
