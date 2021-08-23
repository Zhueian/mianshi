package 设计模式_反复写.模版方法.jdk8模版方法.jdk8写法.Consumer和Supplier;

import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by qiucy on 2021/8/23.
 */
public abstract class AbstractBusinessHandler {

    /**
     * 模板方法
     */
    protected void execute(Supplier<String> supplier, Consumer<BigDecimal> consumer) {
        String number = supplier.get();
        System.out.println(number);
        if (number.startsWith("vip")) {
            //Vip号分配到VIP柜台
            System.out.println("Assign To Vip Counter");
        } else if (number.startsWith("reservation")) {
            //预约号分配到专属客户经理
            System.out.println("Assign To Exclusive Customer Manager");
        }else{
            //默认分配到普通柜台
            System.out.println("Assign To Usual Manager");
        }
        consumer.accept(null);
        judge();
    }

    private void judge() {
        System.out.println("give a praised");
    }
}
