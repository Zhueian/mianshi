package 设计模式_反复写.工厂.抽象工厂方法;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

/**
 * Created by qiucy on 2020/12/24.
 */
public class ReadXML {
    public static Object getObject()  {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("src/"));
            NodeList n1 = doc.getElementsByTagName("className");
            Node classNode = n1.item(0).getFirstChild();
            String cName = "设计模式_反复写.工厂.抽象工厂方法."+classNode.getNodeValue();
            System.out.println("新类名："+cName);
            Class<?> aClass = Class.forName(cName);
            Object o = aClass.newInstance();
            return o;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
