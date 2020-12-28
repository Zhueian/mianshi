package 设计模式_反复写.装饰.base;

/**
 * Created by qiucy on 2020/12/28.
 * 抽象装饰角色 面包的奶油，房子的窗帘  等等
 */
public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}