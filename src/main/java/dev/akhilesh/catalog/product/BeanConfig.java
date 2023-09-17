package dev.akhilesh.catalog.product;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "dev.akhilesh.catalog.product")
@EnableAspectJAutoProxy
public class BeanConfig {
}
