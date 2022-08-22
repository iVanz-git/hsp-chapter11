package com.hspedu;

/**
 * @author 张一凡
 */
public class EnumExc01 {
    public static void main(String[] args) {
        Week[] weekdays = Week.values();
        System.out.println("===所有星期的信息如下==");
        for (Week wdays:weekdays) {
            System.out.println(wdays.getName());
        }

        System.out.println("随便说句话");
        System.out.println("随便说111句话");
        System.out.println("随便说句话");
        System.out.println("随便说111222句话");
        System.out.println("随便说句话");
        System.out.println("随便说句话");
        System.out.println("随便说222333句话");

    }
}


enum Week {

    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期天");
    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
