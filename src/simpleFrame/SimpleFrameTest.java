package simpleFrame;

import javax.swing.*;
import java.awt.*;

/*
    顶层窗口（就是没有包含在其他窗口中的窗口）称为窗体
    AWT库里面有一个名为Frame的类，用于描述这个顶层窗口
    这个类的Swing版本名为JFrame，它扩展了Frame类      JFrame是极少数几个不在画布上绘制的Swing组件之一
                                                因此，它的修饰不见（按钮、标题栏、图标等）由用户的窗口系统绘制，而不是由Swing绘制
 */

public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{       //事件分派线程，它讲鼠标点击和按钮等时间传递给用户界面组件
            var frame = new SimpleFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setResizable(true);
            frame.setTitle("这是一个窗口");
        });
    }
}

class SimpleFrame extends JFrame {      //子类SimpleFrame继承父类JFrame的属性，用于设置窗口的高度和宽度
    private static final int DEFAULT_WIDTH = 800;
    private static final int DEFAULT_HEIGHT = 600;

    public SimpleFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
