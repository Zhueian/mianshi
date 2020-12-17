package 设计模式_反复写.工厂.工厂方法模式_动物园;

/**
 * Created by qiucy on 2020/12/17.
 */
public class HorseFarm implements AnimalFarm {

    @Override
    public Animal newAnimal() {
        System.out.println("新马出生");
        return new Horse();
    }
}
