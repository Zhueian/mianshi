package 设计模式_反复写.模版方法.dzg的crud.SafeEdu;

import 设计模式_反复写.模版方法.dzg的crud.BaseCRUD;
import 设计模式_反复写.模版方法.dzg的crud.BaseCRUDBiz;
import 设计模式_反复写.模版方法.dzg的crud.BaseServive;
import 设计模式_反复写.模版方法.dzg的crud.Redishuancun;

/**
 * Created by qiucy on 2020/12/1.
 */
@Redishuancun(key = {"redisCache_Key"},isCleanWhenAdd = false)
public class anquanjiaoyuService extends BaseServive implements BaseCRUD {
    @Override
    public BaseCRUDBiz getBaseCRUDBiz() {
        return new anquanjiaoyuCRUDBiz();
    }

    public String add(){
        System.out.println("SafeEduService add invoke..");
        return super.add(null);
    }

}
