package com.hspedu.annotation_;

import static com.hspedu.annotation_.Color.*;

/**
 * @author 张一凡
 */
public class HomeWork08 {
    public static void main(String[] args) {
//        Color[] colors = Color.values();

//        for (Color c : colors) {
            switch (RED) {
                case RED:
                    RED.show();
//                    colors[0].show();
                    break;
                case BLUE:
                    BLUE.show();
//                    colors[1].show();
                    break;
                case BLACK:
                    BLACK.show();
//                    colors[2].show();
                    break;
                case YELLOW:
                    YELLOW.show();
//                    colors[3].show();
                    break;
                case GREEN:
                    GREEN.show();
//                    colors[4].show();
                    break;
            }
//        }



    }
}

enum Color implements I2 {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    private int redValue;
    private int greenValue;
    private int blueValue;


    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(this.name() + "三种属性值为：redValue=" + this.redValue +
                " greenValue=" + this.greenValue +
                " blueValue" + this.blueValue);
    }
}

interface I2 {
    void show();
}