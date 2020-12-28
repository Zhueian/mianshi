package 设计模式_反复写.装饰.base;

/**
 * Created by qiucy on 2020/12/28.
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation(){
        super.operation();
        addFunction();
    }

    private void addFunction() {
        System.out.println("为具体构件角色增加的额外功能 : addFunction()");
    }
}
