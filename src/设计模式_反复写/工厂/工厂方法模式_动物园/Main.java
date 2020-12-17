package 设计模式_反复写.工厂.工厂方法模式_动物园;

/**
 * Created by qiucy on 2020/12/17.
 */
public class Main {
    public static void main(String[] args) {
        Animal a;
        AnimalFarm af;
        af = (AnimalFarm)ReadXml2.getObject();
        a = af.newAnimal();
        a.show();
    }
}
