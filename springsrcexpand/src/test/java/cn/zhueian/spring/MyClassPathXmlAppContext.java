package cn.zhueian.spring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qiucy on 2021/6/29.
 */
public class MyClassPathXmlAppContext extends ClassPathXmlApplicationContext {

    public MyClassPathXmlAppContext(String ... configLocations){
        super(configLocations);
    }


    @Override
    protected void initPropertySources() {
        System.out.println("扩展initPropertySource");
//        getEnvironment().setRequiredProperties("abc");
        getEnvironment().setRequiredProperties("username");
//        super.initPropertySources();
    }

    //定制beanFactory
    @Override
    protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
        // 扩展beanDefinition重写和循环引用
        // <bean>标签里面<look-up>和<replace-method>
        super.setAllowBeanDefinitionOverriding(false);
        beanFactory.setAllowCircularReferences(false);
        super.customizeBeanFactory(beanFactory);
    }
}
