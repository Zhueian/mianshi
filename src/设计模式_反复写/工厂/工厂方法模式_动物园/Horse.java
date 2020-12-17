package 设计模式_反复写.工厂.工厂方法模式_动物园;

import javax.swing.*;
import java.awt.*;

/**
 * Created by qiucy on 2020/12/17.
 * 马
 */
public class Horse implements Animal{

    JScrollPane sp;
    JFrame jf = new JFrame("工厂方法模式测试");

    public Horse(){
        Container contentPane = jf.getContentPane();
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 1));
        p1.setBorder(BorderFactory.createTitledBorder("动物：马"));
        sp = new JScrollPane(p1);
        contentPane.add(sp, BorderLayout.CENTER);
        JLabel l1 = new JLabel(new ImageIcon("src/设计模式_反复写/工厂/工厂方法模式_动物园/A_Horse.jpg"));
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
