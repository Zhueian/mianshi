package 设计模式_反复写.责任链.base;

/**
 * Created by qiucy on 2021/1/7.
 * 抽象处理者角色
 */
public abstract class Handler {

    private Handler next;

    public Handler getNext() {
        return next;
    }

    public void setNext(Handler next) {
        this.next = next;
    }

    /**
     * 处理请求方法
     */
    public abstract void handleRequest(String request);
}
