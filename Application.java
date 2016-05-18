package cn.Spring.Demo;

/**
 * Created by bogehu on 16/5/14.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Application {
        public static void main(String[] args) {
            ApplicationContext context=new ClassPathXmlApplicationContext("Spring-Module.xml");
            HelloWorld helloWorld=(HelloWorld)context.getBean("helloBean");
            helloWorld.printHello();
        }
    }
