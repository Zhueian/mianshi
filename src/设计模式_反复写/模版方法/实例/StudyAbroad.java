package 设计模式_反复写.模版方法.实例;

/**
 * Created by qiucy on 2020/11/30.
 * 抽象出国留学
 */
public abstract class StudyAbroad {
    public final void studyAbroadHandler(){
        //入学申请
        applyEnrol();
        //办理因私出国护照，出境卡和公证
        handlePassBook();
        //申请签证
        applyVisa();
    }

    public void handlePassBook(){
        System.out.println("二.办理因私出国护照、出境卡和公证：");
        System.out.println("  1）持录取通知书、本人户口簿或身份证向户口所在地公安机关申请办理因私出国护照和出境卡。");
        System.out.println("  2）办理出生公证书，学历、学位和成绩公证，经历证书，亲属关系公证，经济担保公证。");
    }

    protected abstract void applyEnrol();

    protected abstract void applyVisa();

}
