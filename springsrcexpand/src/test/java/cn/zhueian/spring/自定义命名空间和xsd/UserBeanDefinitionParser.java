package cn.zhueian.spring.自定义命名空间和xsd;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * Created by qiucy on 2021/7/2.
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Nullable
    @Override
    protected Class<?> getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String id = element.getAttribute("id");
        String name = element.getAttribute("name");
        if (StringUtils.hasText(id)){
            builder.addPropertyValue("id",id);
        }
        if (StringUtils.hasText(name)){
            builder.addPropertyValue("name",name);
        }
    }
}
