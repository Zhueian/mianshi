package 设计模式_反复写.模版方法.jdk8模版方法.jdk8写法.单单Consumer;

import java.math.BigDecimal;
import java.util.Random;
import java.util.function.Consumer;

/**
 * Created by qiucy on 2021/8/23.
 */
public class BankBusinessHandler extends AbstractBusinessHandler{

    public void save(BigDecimal amount) {
        execute(a -> System.out.println("save " + amount));
    }

    public void draw(BigDecimal amount) {
        execute(a -> System.out.println("draw " + amount));
    }

    public void moneyManage(BigDecimal amount) {
        execute(a -> System.out.println("draw " + amount));

    }
}
