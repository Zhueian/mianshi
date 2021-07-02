package cn.zhueian.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiucy on 2021/6/29.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("start >> ");
        BeanFactory a = new ClassPathXmlApplicationContext("app.xml");
//        BeanFactory myClassPathXmlAppContext = new MyClassPathXmlAppContext("app.xml");
    }
}
