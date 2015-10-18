package test8.bad.qualifier.main;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
        "model",
        "test8"
})
public class AppConfig {
}
