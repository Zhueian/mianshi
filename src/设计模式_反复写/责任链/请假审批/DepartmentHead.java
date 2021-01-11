package 设计模式_反复写.责任链.请假审批;

/**
 * Created by qiucy on 2021/1/11.
 * 系主任
 */
public class DepartmentHead extends Leader {
    @Override
    public void handleRequest(int leaveDays) {
        if (leaveDays <= 7){
            System.out.println("系主任批准您请假了"+leaveDays+"天。");
            // 落库等biz业务逻辑了
        }else {
            if (getNext() != null){
                getNext().handleRequest(leaveDays);
            }else {
                System.out.println("请假天数太多了，系主任批准不了该假条！");
            }
        }
    }
}
