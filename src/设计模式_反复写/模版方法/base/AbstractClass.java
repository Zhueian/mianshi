package 设计模式_反复写.模版方法.base;

/**
 * Created by qiucy on 2020/11/30.
 */
public abstract class AbstractClass {
    public final void TemplateMethod(){
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    protected abstract void abstractMethod2();

    protected abstract void abstractMethod1();


    protected void SpecificMethod(){
        System.out.println("抽象类中的具体方法被调用。。。");
    }

}
