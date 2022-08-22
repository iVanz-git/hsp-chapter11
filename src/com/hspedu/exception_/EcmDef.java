package com.hspedu.exception_;

import com.sun.scenario.animation.shared.InfiniteClipEnvelope;

import java.text.ParseException;
import java.util.Scanner;

/**
 * @author iVan
 */
public class EcmDef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n1 = Integer.parseInt(scanner.next());
            int n2 = Integer.parseInt(scanner.next());
            System.out.println(MathTool.cal(n1, n2));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}

class MathTool{
    public static double cal(int n1, int n2){
        return (double)n1 / n2;
    }
}

