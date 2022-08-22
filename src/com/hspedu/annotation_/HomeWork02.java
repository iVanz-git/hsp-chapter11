package com.hspedu.annotation_;

/**
 * @author 张一凡
 */
public class HomeWork02 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.testWork(new CalInterface() {
            @Override
            public double work(double d1, double d2) {
                return d1 + d2;
            }
        }, 11, 22);

    }
}


interface CalInterface {
    public double work(double d1, double d2);
}

class CellPhone {
    public void testWork(CalInterface calInterface, double d1, double d2) {
        double sum = calInterface.work(d1, d2);
        System.out.println("testWork()方法的结果是" + sum);
    }

//    public void work() {
//        System.out.println("CellPhone的work（）方法被调用");
//    }
}