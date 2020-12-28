package 设计模式_反复写.装饰.美少女;

/**
 * Created by qiucy on 2020/12/28.
 */
public class Main {
    public static void main(String[] args) {
        //原身
        Morrigan original = new Original();
        original.display();
        //女巫
        Morrigan succubus = new Succubus(original);
        succubus.display();
        //少女
        Morrigan girl = new Girl(original);
        girl.display();
    }
}
