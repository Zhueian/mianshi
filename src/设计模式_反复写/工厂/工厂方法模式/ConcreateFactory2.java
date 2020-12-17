package 设计模式_反复写.工厂.工厂方法模式;

/**
 * Created by qiucy on 2020/12/8.
 */
public class ConcreateFactory2 implements AbstractFactory {
    @Override
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2。。。");
        return new ConcreateProduct2();
    }
}
