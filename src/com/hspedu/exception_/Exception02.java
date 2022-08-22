package com.hspedu.exception_;

/**
 * @author iVan
 */
public class Exception02 {
    public static void main(String[] args) {
        double weight = 120;
        if (weight > 100) {
            throw new WeightException("体重设置超标");
        }
        System.out.println("体重数值正确");
    }
}

class WeightException extends RuntimeException {
    public WeightException(String message) {
        super(message);
    }
}