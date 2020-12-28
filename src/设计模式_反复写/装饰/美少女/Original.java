package 设计模式_反复写.装饰.美少女;

import javax.swing.*;
import java.awt.*;

/**
 * Created by qiucy on 2020/12/28.
 * 具体构件角色：原身
 */
public class Original extends JFrame implements Morrigan{

    private static final long serialVersionUID = 1L;
    private String img = "Morrigan0.jpg";
    public Original(){
        super("《恶魔战士》中的莫莉卡.安斯兰");
    }

    public void setImage(String img){
        this.img = img;
    }

    @Override
    public void display() {
        this.setLayout(new FlowLayout());
        JLabel l1 = new JLabel(new ImageIcon("src/设计模式_反复写/装饰/美少女/"+img));
        this.add(l1);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
