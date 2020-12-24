package 设计模式_反复写.工厂.抽象工厂方法;

/**
 * Created by qiucy on 2020/12/24.
 * 北京农场
 */
public class BJFarm implements Farm{

    @Override
    public Animal newAnimal() {
        System.out.println("新牛出生了");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("蔬菜长成了");
        return new Vegetables();
    }
}
