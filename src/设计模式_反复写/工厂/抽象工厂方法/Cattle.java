package 设计模式_反复写.工厂.抽象工厂方法;

import javax.swing.*;
import java.awt.*;

/**
 * Created by qiucy on 2020/12/18.
 * 牛类
 */
public class Cattle implements Animal {
    JScrollPane sp;
    JFrame jf =  new JFrame("抽象工厂模式测试");

    public Cattle(){
        Container contentPane = jf.getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,1));
        p1.setBorder(BorderFactory.createTitledBorder("动物：牛"));
        sp = new JScrollPane(p1);
        contentPane.add(sp,BorderLayout.CENTER);
        JLabel l1 = new JLabel(new ImageIcon(""));
        p1.add(l1);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void show() {
        jf.setVisible(true);
    }
}
