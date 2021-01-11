package 设计模式_反复写.责任链.base;

/**
 * Created by qiucy on 2021/1/7.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== 责任链start ===");
        //组装责任连
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        h1.setNext(h2);
        //提交请求
        h1.handleRequest("one");
    }
}
