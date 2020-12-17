package 设计模式_反复写.工厂.base;

/**
 * Created by qiucy on 2020/12/1.
 */
public class Client {
    public static void main(String[] args) {
        Product product1 = SimpleFactory.makeProduct(1);
        product1.show();
        Product product2 = SimpleFactory.makeProduct(2);
        product2.show();
    }
    //抽象产品
    public interface Product{
        void show();
    }
    //具体产品 ：ProductA
    static class ConcreteProduct1 implements Product{
        @Override
        public void show() {
            System.out.println("具体产品1展现。。");
        }
    }
    //具体产品 ：ProductB
    static class ConcreteProduct2 implements Product{
        @Override
        public void show() {
            System.out.println("具体产品2展现。。");
        }
    }

    final class Const{
        static final int PRODUCT_A = 1;
        static final int PRODUCT_B = 2;
    }

    static class SimpleFactory{
        public static  Product makeProduct(int kind){
            switch (kind){
                case Const.PRODUCT_A:
                    return new ConcreteProduct1();
                case Const.PRODUCT_B:
                    return new ConcreteProduct2();
                    default:;;
            }
            return null;
        }
    }
}
