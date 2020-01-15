package cn.cnzcb.spring.bean;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zcb on 2020/1/14.
 */
public class SpringInjectionDemo {
    public static void main(String[] args) throws Exception {
        //xml注入
        BeanFactory classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/spring-bean.xml");
        UserXml userXml = classPathXmlApplicationContext.getBean(UserXml.class);
        System.out.println("userXml XML注入对象：" + userXml);

        //注解注入
        AnnotationConfigApplicationContext  annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(UserConfiguration.class);
        annotationConfigApplicationContext.refresh();
        UserAnnotation userAnnotation = annotationConfigApplicationContext.getBean(UserAnnotation.class);
        System.out.println("UserAnnotation注解注入"+userAnnotation);

        //BeanDefinition注入
        BeanDefinitionBuilder definitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(UserBeanDefinition.class);
        definitionBuilder.addPropertyValue("id", "11");
        definitionBuilder.addPropertyValue("name", "java圈");
        org.springframework.beans.factory.config.BeanDefinition beanDefinition = definitionBuilder.getBeanDefinition();
        String beanClassName = beanDefinition.getBeanClassName();
        MutablePropertyValues mutablePropertyValues = beanDefinition.getPropertyValues();
        String id = mutablePropertyValues.getPropertyValue("id").getValue().toString();
        String name = mutablePropertyValues.getPropertyValue("name").getValue().toString();
        System.out.println("BeanDefinition注入对象UserBeanDefition{id=" + id+",name="+name+"}");
    }
}
