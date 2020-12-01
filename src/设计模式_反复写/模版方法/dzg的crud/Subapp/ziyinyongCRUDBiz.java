package 设计模式_反复写.模版方法.dzg的crud.Subapp;

import 设计模式_反复写.模版方法.dzg的crud.BaseCRUDBiz;
import 设计模式_反复写.模版方法.dzg的crud.BaseDTO;

import java.util.List;

/**
 * Created by qiucy on 2020/12/1.
 */
public class ziyinyongCRUDBiz extends BaseCRUDBiz {

    @Override
    public String add(BaseDTO baseDTO) {
        System.out.println("ziyinyongCRUDBiz add invoke..");
        return null;
    }

    @Override
    public String del(BaseDTO baseDTO) {
        return null;
    }

    @Override
    public String update(BaseDTO baseDTO) {
        return null;
    }

    @Override
    public BaseDTO query(BaseDTO baseDTO) {
        return null;
    }

    @Override
    public List queryByPage(BaseDTO baseDTO) {
        return null;
    }
}
