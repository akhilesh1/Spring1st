package dev.akhilesh.catalog.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

@SpringBootApplication
public class Application {

	private static Doctor sf1;
    public static void main(String[] args) {
        //ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
//		ApplicationContext ac=new AnnotationConfigApplicationContext(BeanConfig.class);
//        Doctor sf1 = ac.getBean(Doctor.class);
////
//        sf1.assist();
//        sf1.checkout("new input");
//        sf1.name = "Doc1";
//        System.out.println(sf1.toString());
//
//        ShoppingCart sc=ac.getBean(ShoppingCart.class);
//        sc.checkout("new input");
//        sc.Quantity("qty");
        //Staff sf2 = ac.getBean(Doctor.class);
//
//		sf2.assist();
//		System.out.println(sf2.toString());
//		Staff sf2=(Nurse)ac.getBean("nurse");
//		sf2.assist();
        SpringApplication.run(Application.class, args);
    }

}
