package 设计模式_反复写.模版方法.base;

/**
 * Created by qiucy on 2020/11/30.
 */
public class TempateMethodPattern {
    public static void main(String[] args) {
        AbstractClass tm = new ConcreteClass();
        tm.TemplateMethod();
    }
}
