package 设计模式_反复写.模版方法.dzg的crud;


import 设计模式_反复写.模版方法.dzg的crud.SafeEdu.anquanjiaoyuService;
import 设计模式_反复写.模版方法.dzg的crud.Subapp.ziyingyongService;

/**
 * Created by qiucy on 2020/12/1.
 */
public class Main {
    public static void main(String[] args) {
        //大总管安全教育服务
        System.out.println(new anquanjiaoyuService().add());
        //大总管子应用服务
        // new SubappService.add();
        System.out.println(new ziyingyongService().add());
    }
}
