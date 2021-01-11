package 设计模式_反复写.责任链.请假审批;

/**
 * Created by qiucy on 2021/1/11.
 */
public abstract class Leader {
    private Leader next;

    public Leader getNext() {
        return next;
    }

    public void setNext(Leader next) {
        this.next = next;
    }

    public abstract void handleRequest(int leaveDays);
}
