package com.test;

/**
 * Created by jianguog on 17/3/21.
 */
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
//        HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");

        obj.getMessage();
    }
}