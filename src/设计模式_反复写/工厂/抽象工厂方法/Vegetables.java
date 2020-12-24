package 设计模式_反复写.工厂.抽象工厂方法;

import javax.swing.*;
import java.awt.*;

/**
 * Created by qiucy on 2020/12/22.
 * 蔬菜类
 */
public class Vegetables implements Plant{

    JScrollPane sp;
    JFrame jf = new JFrame("抽象工厂模式测试");

    public Vegetables(){
        Container contentPane = jf.getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1,1));
        p1.setBorder(BorderFactory.createTitledBorder("植物：蔬菜"));
        sp = new JScrollPane(p1);
        contentPane.add(sp,BorderLayout.CENTER);
        JLabel l1 = new JLabel(new ImageIcon("src/P_Vegetables.jpg"));
        p1.add(l1);
        jf.pack();
        jf.setVisible(false);
        //用户点击窗口关闭
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void show() {
        jf.setVisible(true);
    }
}
