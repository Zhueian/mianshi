package 设计模式_反复写.模版方法.钩子;

/**
 * Created by qiucy on 2020/11/30.
 */
public abstract class HookAbstractClass {
    /**
     * 模版方法，按照线性的工作流执行下去,或者各种组合
     */
    public void tempalteMethod(){
        abstractMethod1();
        hookMethod1();
        if (hookMethod2()){
            specificMethod();
        }
        abstractMethod2();
    }

    private void specificMethod(){
        System.out.println("抽象类的具体抽取方法执行。");
    }

    protected abstract void abstractMethod1();

    protected abstract void hookMethod1();

    protected abstract boolean hookMethod2();

    protected abstract void abstractMethod2();
}
