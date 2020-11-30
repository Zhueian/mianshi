package 设计模式_反复写.模版方法.钩子;

/**
 * Created by qiucy on 2020/11/30.
 */
public class Hook1 extends HookAbstractClass{
    @Override
    protected void abstractMethod1() {
        System.out.println("abstractMethod1 执行了");
    }

    @Override
    protected void hookMethod1() {
        System.out.println("hookMethod1 执行了");
    }

    @Override
    protected boolean hookMethod2() {
        // apollo 动态配置
        return true;
    }

    @Override
    protected void abstractMethod2() {
        System.out.println("abstractMethod2 执行了");
    }
}
