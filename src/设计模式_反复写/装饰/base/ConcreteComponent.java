package 设计模式_反复写.装饰.base;

/**
 * Created by qiucy on 2020/12/28.
 * 具体构件角色 ：面包基底
 */
public class ConcreteComponent implements Component {
    public ConcreteComponent() {
        System.out.println("创建具体构件角色");
    }

    @Override
    public void operation() {
        System.out.println("调用具体构件角色的方法 : operation()");
    }

}
