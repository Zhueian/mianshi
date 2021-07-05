package cn.zhueian.spring.自定义命名空间和xsd;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by qiucy on 2021/7/2.
 * user命名空间处理器
 */
public class UserNSHandler extends NamespaceHandlerSupport{
    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
    }
}
