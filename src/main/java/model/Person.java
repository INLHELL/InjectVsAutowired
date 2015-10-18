package model;

import org.springframework.stereotype.Component;

@Component
public class Person implements Party {
    @Override
    public String toString() {
        return "Person{}";
    }
}
