package org.springbasics;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class HelloApp {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //HelloService helloService = context.getBean(HelloService.class);
        //System.out.println(helloService.sayHello());
        //Triangle triangle = new Triangle();
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));

        //below is example of xml based wiring
        //XMLBasedWiring();

        //below function is example of autowiring
        AutoWiredWiring();

    }

    private static void XMLBasedWiring() {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        Shape triangle = (Triangle) context.getBean("triangle");
        triangle.draw();

        Shape circle = (Circle) context.getBean("circle");
        circle.draw();
    }

    private static void AutoWiredWiring() {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringAutoWiring.xml");
        Shape circle = (Circle) context.getBean("circle");
        circle.draw();
        //System.out.println(context.getMessage("greeting", null, "Default greeting", null));
    }

}
