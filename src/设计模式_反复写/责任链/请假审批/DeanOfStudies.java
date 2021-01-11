package 设计模式_反复写.责任链.请假审批;

/**
 * Created by qiucy on 2021/1/11.
 * 教务主任
 */
public class DeanOfStudies extends Leader{
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays<=20){
            System.out.println("教务主任批准您的假条"+leaveDays+"天");
            //教务处长逻辑biz等
        }else {
            if (getNext()!=null){
                getNext().handleRequest(leaveDays);
            }else {
                System.out.println("请假天数太多，教务主任处理不了您的假条批！");
            }
        }
    }
}
