package vn.edu.iuh.fit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vn.edu.iuh.fit.annotationbased.AppConfig;
import vn.edu.iuh.fit.annotationbased.MyNumberFormatService;
import vn.edu.iuh.fit.javabased.User;
import vn.edu.iuh.fit.javabased.UserServices;
import vn.edu.iuh.fit.xmlbased.ex1.Student;
import vn.edu.iuh.fit.xmlbased.ex2.Person;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Student s1 = context.getBean("s1", Student.class);
//        Student s2 = context.getBean("s2", Student.class);
//        Student s3 = context.getBean("s3", Student.class);
//
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//
//
//        Person p1 = context.getBean("p1", Person.class);
//        System.out.println(p1);


//        ApplicationContext context = new AnnotationConfigApplicationContext(UserServices.class);
//        User user = context.getBean(User.class);
//        System.out.println(user);


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyNumberFormatService myNumberFormatService = context.getBean(MyNumberFormatService.class);

        System.out.println(myNumberFormatService.getFormat(5.13486));
    }
}