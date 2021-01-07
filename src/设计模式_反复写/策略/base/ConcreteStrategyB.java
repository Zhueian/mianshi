package 设计模式_反复写.策略.base;

/**
 * Created by qiucy on 2020/12/28.
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyMethod() {
        System.out.println("具体策略B的策略方法被访问！");
    }
}
