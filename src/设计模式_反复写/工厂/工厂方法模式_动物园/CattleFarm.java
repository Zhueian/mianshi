package 设计模式_反复写.工厂.工厂方法模式_动物园;

/**
 * Created by qiucy on 2020/12/17.
 */
public class CattleFarm implements AnimalFarm {
    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生");
        return new Cattle();
    }
}
