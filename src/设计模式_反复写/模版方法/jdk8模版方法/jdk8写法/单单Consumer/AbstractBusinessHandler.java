package 设计模式_反复写.模版方法.jdk8模版方法.jdk8写法.单单Consumer;

import java.math.BigDecimal;
import java.util.Random;
import java.util.function.Consumer;

/**
 * Created by qiucy on 2021/8/23.
 */
public abstract class AbstractBusinessHandler {
    /**
     * 模版方法
     * @param consumer
     */
    protected void execute(Consumer<BigDecimal> consumer) {
        getNumber();
        consumer.accept(null);
        judge();
    }

    private void getNumber() {
        System.out.println("number-00" + new Random().nextInt());
    }

    private void judge() {
        System.out.println("give a praised");
    }
}
