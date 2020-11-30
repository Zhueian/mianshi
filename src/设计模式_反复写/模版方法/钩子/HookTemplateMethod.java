package 设计模式_反复写.模版方法.钩子;

/**
 * Created by qiucy on 2020/11/30.
 */
public class HookTemplateMethod {
    public static void main(String[] args) {
        HookAbstractClass hook1 = new Hook1();
        hook1.tempalteMethod();
    }
}
