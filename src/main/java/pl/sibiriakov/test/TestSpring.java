package pl.sibiriakov.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        TestBean testBean = context.getBean("testBean",TestBean.class);
        System.out.println(testBean.getName());
        context.close();//Закрытие спринга после работы с ним

    }
}
