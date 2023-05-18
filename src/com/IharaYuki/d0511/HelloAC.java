package com.IharaYuki.d0511;

public class HelloAC {

    interface IHello{
        void print();
    }

    public void sayHello() {
        IHello hello1 = new IHello() {
            String name = "AAAAA";
            @Override
            public void print() {
                System.out.println(name);

            }
        };
        hello1.print();

        IHello hello2 = new IHello() {
            String name = "BBB";
            @Override
            public void print() {
                System.out.println(name);

            }
        };
        hello2.print();

    }
    public static void main(String[] args) {
        HelloAC helloAC = new HelloAC();
        helloAC.sayHello();

    }
}

