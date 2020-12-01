package 设计模式_反复写.模版方法.dzg的crud;

import java.util.List;

/**
 * Created by qiucy on 2020/11/30.
 * 基础增删改查
 */
public interface BaseCRUD<REQ extends BaseDTO, RES extends BaseDTO> {
    /**
     * 增
     * @param req
     * @return
     */
    String add(REQ req);

    /**
     * 删
     * @param req
     * @return
     */
    String del(REQ req);

    /**
     * 改
     * @param req
     * @return
     */
    String update(REQ req);

    /**
     * 查
     * @param req
     * @return
     */
    RES query(REQ req);

    /**
     * 分页查
     * @param req
     * @return
     */
    List<RES> queryByPage(REQ req);

    /**
     * 清除redis缓存
     * @param req
     * @return
     */
    String cleanRedisCache(REQ req);
}
