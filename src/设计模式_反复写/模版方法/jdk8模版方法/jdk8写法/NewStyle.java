package 设计模式_反复写.模版方法.jdk8模版方法.jdk8写法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by qiucy on 2021/8/23.
 */
public class NewStyle {
    public static void main(String[] args) {
        // Supplier
        Supplier<List<String>> listSupplier = ArrayList::new;

        // Consumer
        Consumer<String> printConsumer = a1 -> System.out.println(a1);
        printConsumer.accept("test-printConsumer");

        Consumer<String> stringConsumer = (s) -> System.out.println(s.length());
        Arrays.asList("ab", "abc", "a", "abcd").stream().forEach(stringConsumer);
    }
}
