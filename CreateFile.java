import javax.swing.*;
import java.awt.*;

public class CreateFile{
    public static void main(String[] args) {

        JFrame f=new JFrame("Button Example");
        JButton b=new JButton("Click Here");
        JButton c=new JButton("Click Here");
        JButton d=new JButton("Click Here");
        JButton e=new JButton("Click Here");
        JButton g=new JButton("Click Here");
        b.setBounds(50,120,95,30);
        c.setBounds(50,160,95,30);
        d.setBounds(50,200,95,30);
        e.setBounds(50,240,95,30);
        g.setBounds(50,80,95,30);
        f.add(b);
        f.add(c);
        f.add(d);
        f.add(e);
        f.add(g);
        f.setBackground(Color.green);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}