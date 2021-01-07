package 设计模式_反复写.策略.base;

/**
 * Created by qiucy on 2020/12/28.
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略A的策略方法被访问！");
    }
}
