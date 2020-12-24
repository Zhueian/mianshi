package 设计模式_反复写.工厂.抽象工厂方法;

/**
 * Created by qiucy on 2020/12/22.
 * 农场类，生产动物：牛马 ； 植物：水果蔬菜
 */
public interface Farm {

    public Animal newAnimal();

    public Plant newPlant();
}
