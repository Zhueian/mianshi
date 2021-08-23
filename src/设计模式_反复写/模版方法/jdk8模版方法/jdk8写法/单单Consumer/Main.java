package 设计模式_反复写.模版方法.jdk8模版方法.jdk8写法.单单Consumer;

import java.math.BigDecimal;

/**
 * Created by qiucy on 2021/8/23.
 */
public class Main {
    public static void main(String[] args) {
        BankBusinessHandler businessHandler = new BankBusinessHandler();
        businessHandler.save(new BigDecimal("1000"));
        businessHandler.draw(new BigDecimal("1000"));
        businessHandler.moneyManage(new BigDecimal("1000"));
    }
}
