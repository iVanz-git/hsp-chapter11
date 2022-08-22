package com.hspedu.annotation_;

/**
 * @author 张一凡
 */
public class HomeWork05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
        String s123 = new StringBuilder("j").append("ava").toString();
        System.out.println("10:" + (s123.intern()==s123));//

    }
}

class A {
    private String name = "AAA";

    public void f1() {
        class B {
            private final String NAME = "BBB";

            public void show() {
                System.out.println("内部类B的name=" + this.NAME);
                System.out.println("外围类A的name=" + A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}