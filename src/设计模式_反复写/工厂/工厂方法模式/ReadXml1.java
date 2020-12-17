package 设计模式_反复写.工厂.工厂方法模式;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

/**
 * Created by qiucy on 2020/12/8.
 */
public class ReadXml1 {
    /**
     *     该方法用于从xml配置文件中提取具体类类名，并返回一个实例对象
     */
    public static Object getObject(){
        try {
            //创建文档对象
            DocumentBuilderFactory df = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = df.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/设计模式_反复写/工厂/工厂方法模式/config1.xml"));
            //获取包含类名的文本节点
            NodeList n1 = doc.getElementsByTagName("className");
            Node classNode = n1.item(0).getFirstChild();
            String cName = /*"FactoryMethod."+*/classNode.getNodeValue();
            System.out.println("新类名："+cName);
            //通过类名生成实例对象并将其返回
            Class<?> aClass = Class.forName(cName);
            Object o = aClass.newInstance();
            return o;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
