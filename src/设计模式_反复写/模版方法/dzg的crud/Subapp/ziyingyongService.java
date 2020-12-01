package 设计模式_反复写.模版方法.dzg的crud.Subapp;

import 设计模式_反复写.模版方法.dzg的crud.BaseCRUD;
import 设计模式_反复写.模版方法.dzg的crud.BaseCRUDBiz;
import 设计模式_反复写.模版方法.dzg的crud.BaseServive;
import 设计模式_反复写.模版方法.dzg的crud.Redishuancun;
import 设计模式_反复写.模版方法.dzg的crud.SafeEdu.anquanjiaoyuCRUDBiz;

/**
 * Created by qiucy on 2020/12/1.
 */
@Redishuancun(key = {"ziyingyong_redisCache_Key"},isCleanWhenAdd = true)
public class ziyingyongService extends BaseServive implements BaseCRUD {
    @Override
    public BaseCRUDBiz getBaseCRUDBiz() {
        return new anquanjiaoyuCRUDBiz();
    }

    public String add(){
        System.out.println("ziyingyongService add invoke..");
        return super.add(null);
    }
}
