package test1.ambiguous.beans.main;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
        "model",
        "test1"
})
public class AppConfig {
}
