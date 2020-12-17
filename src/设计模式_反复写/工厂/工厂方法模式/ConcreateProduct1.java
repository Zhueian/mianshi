package 设计模式_反复写.工厂.工厂方法模式;

/**
 * Created by qiucy on 2020/12/8.
 */
public class ConcreateProduct1 implements Product {
    @Override
    public void show() {
        System.out.println("具体产品1显示。。");
    }
}
