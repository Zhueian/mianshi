package 设计模式_反复写.模版方法.jdk8模版方法.jdk8写法.Consumer和Supplier;

import java.math.BigDecimal;

/**
 * Created by qiucy on 2021/8/23.
 */
public class Main {
    public static void main(String[] args) {
        BankBusinessHandler obj = new BankBusinessHandler();
        obj.save(new BigDecimal("1000"));
        obj.saveReservation(new BigDecimal("1000"));
        obj.saveVip(new BigDecimal("1000"));
    }
}
