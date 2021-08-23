package 设计模式_反复写.模版方法.jdk8模版方法.原始jdk7写法;

import java.util.Random;

/**
 * Created by qiucy on 2021/8/23.
 */
public abstract class AbstractBusinessHandler {
    /**
     * 模板方法
     */
    public final void execute(){
        getNumber();
        handle();
        judge();
    }

    /**
     * 取号
     * @return
     */
    private void getNumber(){
        System.out.println("number-00" + new Random().nextInt());
    }

    /**
     * 办理业务
     */
    public abstract void handle(); //抽象的办理业务方法，由子类实现

    /**
     * 评价
     */
    private void judge(){
        System.out.println("give a praised");
    }

}
