package 设计模式_反复写.策略.base;

/**
 * Created by qiucy on 2020/12/28.
 * 环境类
 */
public class Context {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void strategyMethod(){
        strategy.strategyMethod();
    }
}
