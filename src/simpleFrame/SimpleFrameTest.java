package simpleFrame;

import javax.swing.*;   //javax表示这是一个扩展包，而不是核心包，从1.2版本每个Java实现都含有这些包
import java.awt.*;

/*
    顶层窗口（就是没有包含在其他窗口中的窗口）称为窗体
    AWT库里面有一个名为Frame的类，用于描述这个顶层窗口
    这个类的Swing版本名为JFrame，它扩展了Frame类      JFrame是极少数几个不在画布上绘制的Swing组件之一
                                                因此，它的修饰不见（按钮、标题栏、图标等）由用户的窗口系统绘制，而不是由Swing绘制
 */

public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            /*
                事件分派线程，它将鼠标点击和按钮等时间传递给用户界面组件
                EventQueue.invokeLater(() ->{
                });
             */
            var frame = new SimpleFrame();  //构造SimpleFrame的对象
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //在用户关闭这个窗体时，简单的退出程序
            /*
                在包含多个窗体的其他程序中，一般用户关闭其中一个窗体程序只会将窗体隐藏起来，而程序并没有中止
                一旦最后一个程序不可见，程序才中止，这样处理比较合适，但Swing并不是这样工作的
             */
            frame.setVisible(true);     //使窗体可见
            /*
                如果只是构造窗体，并不会自动显示这个窗体
                程序员可以在第一次显示之前向其中添加组件
             */
            frame.setLocation(400,200);
            /*
                setLocation(x,y)方法用于调整窗体位置
                等同于这行代码frame.setBounds(400,200,800,500);    setBounds（x,y,width,height)方法用于调整窗体位置和大小
                此处x,y,width,height都为int类型
             */
            frame.setResizable(true);       //确定是否允许用户改变窗体的大小

            frame.setTitle("这是一个窗口");   //设置窗体标题，将方法内设置的属性返回给方法作为窗体的标题

            Toolkit kit = Toolkit.getDefaultToolkit();  //调用Toolkit类的静态方法getDefaultToolkit得到一个kit对象     Toolkit类相当于一个“地基”，包含大量与原生窗口系统交互的方法
            Dimension screenSize = kit.getScreenSize();     //调用getScreenSize方法，这个方法以Dimension对象的形式返回屏幕大小
            int screenWidth = screenSize.width;
            int screenHeight = screenSize.height;   //使用Dimension对象用公共（！）实例变量width和height同时保存屏幕的宽度和高度
            frame.setSize(screenWidth/2,screenHeight/2);    //使用合适的百分比指定窗体的大小

            Image img = new ImageIcon("image/avatar.jpg").getImage();
            frame.setIconImage(img);                                            //提供窗口图标
        });
    }
    /*
        完成了初始化语句之后，main方法推出
        退出main方法并没有中止程序，中止的只是主线程
        事件分派线程会保持程序处于激活状态，直到通过关闭窗体或调用System.in方法中止程序
     */
}

class SimpleFrame extends JFrame {      //子类SimpleFrame继承父类JFrame的属性

    public SimpleFrame() {  //重写SimpleFrame类的构造方法
        add(new MyComponent());     //将一个给定的组件添加到该窗体的内容窗格中，并返回这个组件
        pack();     //调整窗口大小，要考虑其组件的首选大小
    }
}

/*
    将一个组件添加到窗体中，并在这个组件上绘制消息
    定义一个扩展JComponent的类，并覆盖其中的paintComponent方法
 */

class MyComponent extends JComponent {

    public static final int MESSAGE_X = 300;
    public static final int MESSAGE_Y = 200;

    private static final int DEFAULT_WIDTH = 800;
    private static final int DEFAULT_HEIGHT = 500;

    public void paintComponent(Graphics g) {    //覆盖这个方法来描述需要如何绘制组件
        /*
            paintComponent方法有一个Graphics类型的参数，
            Graphics对象保存着用于绘制图像和文本的一组设置
            例如，设置的字体或当前的颜色
            所有的绘制必须通过Graphics对象完成，其中包含了绘制团、图像和文本的方法
         */
        g.drawString("这里随便写点东西",MESSAGE_X,MESSAGE_Y);
    }

    public Dimension getPreferredSize() {
        /*
            最后，组件要告诉用户它会有多大
            覆盖getPreferredSize方法，返回一个包含首选宽度和高度的Dimension类对象
         */
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
