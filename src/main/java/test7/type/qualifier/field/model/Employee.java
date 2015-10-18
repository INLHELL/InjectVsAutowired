package test7.type.qualifier.field.model;

import org.springframework.stereotype.Component;

@Component
public class Employee implements Party {
    @Override
    public String toString() {
        return "Employee{}";
    }
}
