package 设计模式_反复写.模版方法.dzg的crud;

/**
 * Created by qiucy on 2020/12/1.
 */
public enum  Sss {
    //0，待审核
    pending("待审核","0"),
    //1，正常
    normal("正常","1"),
    //2，无效
    invalid("无效","2"),
    //3，删除
    delete("删除","3"),
    //4，暂停
    stop("暂停","4");
    private String num;
    private String statusStr;


    Sss(String num, String statusStr) {
        this.num = num;
        this.statusStr = statusStr;
    }
}
