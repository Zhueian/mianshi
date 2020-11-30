package 设计模式_反复写.模版方法.实例;

/**
 * Created by qiucy on 2020/11/30.
 * 留学流程
 */
public class StudyAbroadProcess {
    public static void main(String[] args) {
        StudyAbroad sa = new USAStudyAbroad();
        sa.studyAbroadHandler();
        System.out.println("======================   ===================  =====================");
        StudyAbroad sa2 = new UKStudyAbroad();
        sa2.studyAbroadHandler();
    }
}
