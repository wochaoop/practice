package simpleFrame.button;

/*
    任何支持GUI的操作环境会持续监视按钮或点击鼠标之类的时间
    这些时间再报告给正在运行的程序
    每个程序决定如何对这些事件做出响应（如果确实有事件发生）
 */

import javax.swing.*;
import java.awt.*;

/*
    在AWT中，事件源（如按钮或滚动条）有一些方法，允许你注册事件监听器，这些对象会对事件做出所需的响应

    1、事件监听器是一个实现了监听器接口的类的实例
    2、事件源对象能够注册监听器对象并向其发送事件对象
    3、当事件发生时，事件源将事件对象发送给所有注册的监听器
    4、监听器对象再使用事件对象中的信息决定如何对事件做出响应
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame() {
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);

        var yellowButton = new JButton("Yellow");
        var blueButton = new JButton("Blue");
        var redButton = new JButton("Red");         //在按钮制造器中指定一个标签字符串或一个图标，或者两项都需要指定

        buttonPanel = new JPanel();

        blueButton.add(yellowButton);
        blueButton.add(blueButton);
        blueButton.add(redButton);      //调用add方法将按钮添加到面板中

        add(blueButton);

        var yellowAction = new ColorAction(Color.YELLOW);
        var blueAction = new ColorAction(Color.BLUE);
        var redAction = new ColorAction(Color.RED);     //为每种颜色构造一个对象

        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);         //并将这些对象设置为按钮监听器
    }

    /*
        添加监听这些按钮的代码
        需要一个实现了ActionListener接口的类
        这个类应该包含一个actionPerformed方法
        方法标签名为：public void actionPerformed(ActionEvent event)
     */

    private class ColorAction implements ActionListener {
        private Color backgroundColor;

        public ColorAction(Color c) {
            backgroundColor = c;
        }

        @Override
        public void actionPerformed(ActionEvent event) {    //actionPerformed将接受一个ActionEvent类型的对象作为参数，这个事件对象包含了所发生事件的相关信息
            buttonPanel.setBackground(backgroundColor);
        }
    }
}

/*
    响应按钮点击事件的简单示例
    再一个面板中放置三个按钮，另外添加三个监听器对象作为这些按钮的动作监听器

    只要用户点击面板上的任意一个按钮，相关的监听器就会接受到一个ActionEvent对象，指示点击了莫格按钮

    在此示例中，监听器对象将改变面板的背景颜色
 */