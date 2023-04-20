/*
定义一个Parent类，有一个属性name，及输出属性方法showInfo；
定义一个Children类继承于Parent类，Children类有一个属性age，
在Children类main函数中创建Children类对象，
该对象调用showInfo方法，观察运行结果。
*/
package top.xiwangly.work;

public class Parent {
    private String name;

    public Parent(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Name: " + this.name);
    }
}

