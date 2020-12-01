package 设计模式_反复写.模版方法.dzg的crud;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by qiucy on 2020/11/30.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Redishuancun {

    String[] key() default {};

    boolean isCleanWhenAdd() default true;
}
