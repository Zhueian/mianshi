package 设计模式_反复写.策略.base;

/**
 * Created by qiucy on 2020/12/28.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        Strategy concreteStrategy = new ConcreteStrategyA();
        context.setStrategy(concreteStrategy);
        context.strategyMethod();
        System.out.println("==========================");
        concreteStrategy = new ConcreteStrategyB();
        context.setStrategy(concreteStrategy);
        context.strategyMethod();
    }
}