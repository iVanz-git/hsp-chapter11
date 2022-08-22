package com.hspedu.annotation_;

/**
 * @author 张一凡
 */
public class HomeWork07 {
    public static void main(String[] args) {
        Car c1 = new Car(11);
        Car c2 = new Car(-11);
        Car c3 = new Car(55);

            c1.getAir().flow();
            c2.getAir().flow();
            c3.getAir().flow();
    }
}

class Car{
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    class Air{
        public void flow(){
            if (Car.this.temperature > 40) {
                System.out.println("温度为："+ Car.this.temperature + " 温度高于40℃吹冷气...");
            } else if (Car.this.temperature < 0){
                System.out.println("温度为："+ Car.this.temperature + " 温度低于0℃吹暖气...");
            } else {
                System.out.println("温度为："+ Car.this.temperature + " 位于0℃~40℃之间，停止吹风...");
            }
        }
    }
    public Air getAir(){
        return new Air();
    }

}