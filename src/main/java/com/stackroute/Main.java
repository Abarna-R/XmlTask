package com.stackroute;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main( String[] args )
    {
        System.out.println("***Using BeanFactory***");
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie3=(Movie)factory.getBean("movie3");
        System.out.println(movie3.getActor().getName());
        System.out.println( movie3.getActor().getGender());
        System.out.println(movie3.getActor().getAge());

        System.out.println("***Using ApplicationContext***");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1=(Movie)context.getBean("movie1");
        System.out.println(movie1.getActor().getName());
        System.out.println(movie1.getActor().getGender());
        System.out.println(movie1.getActor().getAge());
    }
}
