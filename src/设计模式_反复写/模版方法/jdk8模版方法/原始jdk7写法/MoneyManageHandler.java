package 设计模式_反复写.模版方法.jdk8模版方法.原始jdk7写法;

/**
 * Created by qiucy on 2021/8/23.
 */
//理财业务的实现类

public class MoneyManageHandler extends AbstractBusinessHandler{
    @Override
    public void handle() {
        System.out.println("money manage");
    }
}
