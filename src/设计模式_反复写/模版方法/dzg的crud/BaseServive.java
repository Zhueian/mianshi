package 设计模式_反复写.模版方法.dzg的crud;

import java.util.List;

/**
 * Created by qiucy on 2020/11/30.
 */
public abstract class BaseServive<REQ extends BaseDTO, RES extends BaseDTO> implements BaseCRUD<REQ,RES> {

    public abstract BaseCRUDBiz getBaseCRUDBiz();

    Redishuancun annotation = this.getClass().getAnnotation(Redishuancun.class);

    @Override
    public String add(REQ req) {
        String add = getBaseCRUDBiz().add(req);
        TaskExecutors.executeTask(new Runnable() {
            @Override
            public void run() {
                if (isCleanWhenAdd()) {
                    for (String key : annotation.key()){
                        //redisClient.set(key,"");
                        System.out.println("redisClient.set("+key+",..);");
                    }
                }
            }
        });

        return "add_ok";
    }

    @Override
    public String del(REQ req) {
        return null;
    }

    @Override
    public String update(REQ req) {
        String update = getBaseCRUDBiz().update(req);
        TaskExecutors.executeTask(new Runnable() {
            @Override
            public void run() {
                if (isCleanWhenAdd()) {
                    for (String key : annotation.key()){
                        System.out.println("redisClient.del("+key+")");
                        //redisClient.del(key);
                    }
                }
            }
        });

        return "update_ok";
    }

    @Override
    public RES query(REQ req) {
        return null;
    }

    @Override
    public List<RES> queryByPage(REQ req) {
        return null;
    }

    /**
     * final，防止子类改变方法逻辑
     * @param req
     * @return
     */
    @Override
    public final String cleanRedisCache(REQ req) {
        return null;
    }

    public boolean isCleanWhenAdd() {

        if (annotation != null){
            return annotation.isCleanWhenAdd();
        }
        return false;
    }


}
