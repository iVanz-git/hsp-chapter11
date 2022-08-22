package com.hspedu.annotation_;

/**
 * @author 张一凡
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Person tangSeng = new Person("唐僧",new Horse());
        tangSeng.chooseVehicle("大河");
        tangSeng.chooseVehicle("一般情况");

    }
}

interface Vehicle {
    void work();
}

class Horse implements Vehicle {
    @Override
    public void work() {
        System.out.println("选用Horse作为交通工具");
    }
}

class Boat implements Vehicle {
    @Override
    public void work() {
        System.out.println("选用Boat作为交通工具");
    }
}

class TransFactory {
    private static Horse horse = new Horse();

    private TransFactory() {
    }

    public static Horse getHorse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }
}


class Person {
    private String name;
    private Vehicle vehicle;

    public Person(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void chooseVehicle(String str) {
        if (str == "大河") {
            TransFactory.getBoat().work();
        } else {
            TransFactory.getHorse().work();
        }
    }
}