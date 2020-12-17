package 设计模式_反复写.工厂.工厂方法模式;

/**
 * Created by qiucy on 2020/12/8.
 */
public class Main {
    public static void main(String[] args) {
        Product a;
        AbstractFactory af;
        af =(AbstractFactory) ReadXml1.getObject();
        Product product = af.newProduct();
        product.show();
    }
}
