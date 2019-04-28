package homeWork1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//        IRegistry registry = context.getBean("registry", IRegistry.class);
//        registry.whereDoctor();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IRegistry registry = context.getBean("registry", IRegistry.class);
        registry.whereDoctor();
    }
}
