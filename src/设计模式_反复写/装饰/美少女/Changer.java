package 设计模式_反复写.装饰.美少女;

/**
 * Created by qiucy on 2020/12/28.
 * 抽象装饰角色：变形
 */
public abstract class Changer implements Morrigan {

    Morrigan m;

    public Changer(Morrigan m) {
        this.m = m;
    }

    @Override
    public void display() {
        m.display();
    }
}
