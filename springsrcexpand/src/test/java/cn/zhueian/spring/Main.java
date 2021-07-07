package cn.zhueian.spring;

import cn.zhueian.spring.selfEditor.Customer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiucy on 2021/6/29.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("start >> ");
        //第六节课 自定义编辑器注册器
        BeanFactory a = new ClassPathXmlApplicationContext("selfEditor.xml");
        Customer customer = (Customer) a.getBean(Customer.class);
        System.out.println(customer);
//        BeanFactory a = new ClassPathXmlApplicationContext("app.xml");
//        BeanFactory myClassPathXmlAppContext = new MyClassPathXmlAppContext("app.xml");

    }
}
