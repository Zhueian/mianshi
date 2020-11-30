package 设计模式_反复写.模版方法.实例;

/**
 * Created by qiucy on 2020/11/30.
 * 美国留学
 */
public class USAStudyAbroad extends StudyAbroad{

    @Override
    protected void applyEnrol() {
        System.out.println("一.入学申请：");
        System.out.println(" 1）：美国法律，黑命贵。");
        System.out.println(" 2）：美国不能有种族歧视。");
    }

    @Override
    protected void applyVisa() {
        System.out.println("三.签证申请");
        System.out.println(" 1）：美国签证step1。");
        System.out.println(" 2）：美国签证step1。");
    }
}
