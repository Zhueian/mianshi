package 设计模式_反复写.模版方法.实例;

/**
 * Created by qiucy on 2020/11/30.
 * 英国留学
 */
public class UKStudyAbroad extends StudyAbroad{
    @Override
    protected void applyEnrol() {
        System.out.println("一.入学申请：");
        System.out.println(" 1）：英国法律，白命贵。");
        System.out.println(" 2）：英国不能有同性恋歧视。");
    }

    @Override
    protected void applyVisa() {
        System.out.println("三.签证申请");
        System.out.println(" 1）：英国签证step1。");
        System.out.println(" 2）：英国签证step1。");
    }
}
