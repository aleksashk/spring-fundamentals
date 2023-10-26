package by.flameksandr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"by.flameksandr.services", "by.flameksandr.aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {

}
