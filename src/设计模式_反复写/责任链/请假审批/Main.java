package 设计模式_反复写.责任链.请假审批;

/**
 * Created by qiucy on 2021/1/11.
 *
 */
public class Main {
    public static void main(String[] args) {
        //组装责任链
        //系主任
        Leader l1 = new DepartmentHead();
        //院长
        Leader l2 = new Dean();
        //教务主任
        Leader l3 = new DeanOfStudies();
        l1.setNext(l2);
        l2.setNext(l3);
        l1.handleRequest(17);
    }
}
