package test4.name.qualifier.main;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
        "model",
        "test4"
})
public class AppConfig {
}
