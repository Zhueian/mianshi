package 设计模式_反复写.装饰.base;

/**
 * Created by qiucy on 2020/12/28.
 */
public class Main {
    public static void main(String[] args) {
        //具体构件 面包
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("=========================");
        //具体装饰 奶油，传入面包
        Component d = new ConcreteDecorator(p);
        d.operation();
    }
}
