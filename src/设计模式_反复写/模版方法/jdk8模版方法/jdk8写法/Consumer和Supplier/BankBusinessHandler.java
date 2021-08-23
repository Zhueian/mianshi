package 设计模式_反复写.模版方法.jdk8模版方法.jdk8写法.Consumer和Supplier;


import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by qiucy on 2021/8/23.
 */
public class BankBusinessHandler extends AbstractBusinessHandler {
    public void saveVip(BigDecimal amount) {

        execute(() -> "vipNumber-00" + new Random().nextInt(), a -> System.out.println("save " + amount));

    }

    public void save(BigDecimal amount) {

        execute(() -> "number-00" + new Random().nextInt(), a -> System.out.println("save " + amount));

    }

    public void saveReservation(BigDecimal amount) {

        execute(() -> "reservationNumber-00" + new Random().nextInt(), a -> System.out.println("save " + amount));

    }
}
