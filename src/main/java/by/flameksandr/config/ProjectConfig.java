package by.flameksandr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"by.flameksandr.services"})
public class ProjectConfig {
}
