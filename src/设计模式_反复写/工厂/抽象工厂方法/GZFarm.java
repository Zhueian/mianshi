package 设计模式_反复写.工厂.抽象工厂方法;

/**
 * Created by qiucy on 2020/12/24.
 */
public class GZFarm implements Farm {
    @Override
    public Animal newAnimal() {
        System.out.println("新马出生了");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("水果长成了");
        return new Fruitage();
    }
}
