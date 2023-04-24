package top.xiwangly.test;

import java.awt.*;
import javax.swing.*;
// java绘图原理

public class 画一个圆  extends JFrame {
    MyPanel mp = null;
    public static void main(String[] args) {
        画一个圆 demo01 = new 画一个圆();
    }

    public 画一个圆(){
        mp = new MyPanel();
        this.add(mp);

        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}


// 定义一个MyPanel面板，用于绘图区域
class MyPanel extends JPanel{
    //覆盖JPanel
    // Graphics 是绘图的重要类，可以理解成一支画笔
    public void paint(Graphics g){
        // 	1. 调用父类函数完成初始化任务
        //	这句话不可以少
        super.paint(g);

        // 先画出一个圆圈
        g.drawOval(10, 10, 200, 200);
    }
}