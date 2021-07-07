package cn.zhueian.spring.selfEditor;

import java.beans.PropertyEditorSupport;

/**
 * Created by qiucy on 2021/7/6.
 */
public class AddressPropertyEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
//        super.setAsText(text);
        System.out.println("text:"+text);
        String[] s = text.split("_");
        Address address = new Address();
        address.setProvince(s[0]);
        address.setCity(s[1]);
        address.setTown(s[2]);
        this.setValue(address);
    }
}
