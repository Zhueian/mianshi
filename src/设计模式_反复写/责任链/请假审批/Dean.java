package 设计模式_反复写.责任链.请假审批;

/**
 * Created by qiucy on 2021/1/11.
 * 院长类
 */
public class Dean extends Leader {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 10){
            System.out.println("院长批准你请假"+leaveDays+"天！");
            //院长biz逻辑落库等
        }else {
            if (getNext()!=null){
                getNext().handleRequest(leaveDays);
            }else{
                System.out.println("请假天数太多，院长批准不了该假条！");
            }
        }
    }
}
