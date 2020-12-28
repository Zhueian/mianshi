package 设计模式_反复写.装饰.美少女;

/**
 * Created by qiucy on 2020/12/28.
 */
public class Girl extends Changer{

    public Girl(Morrigan m) {
        super(m);
    }

    @Override
    public void display() {
        setChanger();
        super.display();
    }

    private void setChanger() {
        ((Original)super.m).setImage("Morrigan2.jpg");
    }
}
