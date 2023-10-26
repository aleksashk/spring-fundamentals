package by.flameksandr.main;

import by.flameksandr.config.ProjectConfig;
import by.flameksandr.services.HelloService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            HelloService service = c.getBean(HelloService.class);
            service.hello("John");
        }
    }
}
