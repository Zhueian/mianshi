package 设计模式_反复写.模版方法.dzg的crud;

import java.util.List;

/**
 * Created by qiucy on 2020/11/30.
 */
public abstract class BaseCRUDBiz<REQ extends BaseDTO,RES extends BaseDTO> {
    /**
     * 增
     * @param req
     * @return
     */
    public String add(REQ req){
        throw new RuntimeException("方法不可直接调用，需要子类重写");
    }

    /**
     * 删
     * @param req
     * @return
     */
    public abstract String del(REQ req);

    /**
     * 改
     * @param req
     * @return
     */
    public abstract String update(REQ req);

    /**
     * 查
     * @param req
     * @return
     */
    public abstract RES query(REQ req);

    /**
     * 分页查
     * @param req
     * @return
     */
    public abstract List<RES> queryByPage(REQ req);
}
