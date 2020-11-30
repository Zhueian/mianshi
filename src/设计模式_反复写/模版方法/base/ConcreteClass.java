package 设计模式_反复写.模版方法.base;

/**
 * Created by qiucy on 2020/11/30.
 */
public class ConcreteClass extends AbstractClass{

    @Override
    protected void abstractMethod2() {
        System.out.println("抽象方法1的实现调用。。。");
    }

    @Override
    protected void abstractMethod1() {
        System.out.println("抽象方法1的实现调用。。。");
    }
}
