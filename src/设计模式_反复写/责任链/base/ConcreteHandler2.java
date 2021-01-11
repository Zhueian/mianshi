package 设计模式_反复写.责任链.base;

/**
 * Created by qiucy on 2021/1/7.
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("two".equals(request)){
            System.out.println("具体处理者2负责处理该请求！");
        }else{
            if (getNext()!=null){
                getNext().handleRequest(request);
            }else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
