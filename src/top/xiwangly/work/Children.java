package top.xiwangly.work;

public class Children extends Parent {
    private int age;

    public Children(String name, int age) {
        super(name);
        this.age = age;
    }

    public static void main(String[] args) {
        Children child = new Children("John", 10);
        child.showInfo();
    }
}
