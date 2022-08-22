package com.hspedu.exception_;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author iVan
 */
public class ExceptionExc01 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

//        do {
            try {
                System.out.println("请输出一个整数");
//                int ipt = Integer.parseInt(scanner.next());
                int ipt = scanner.nextInt();
//                break;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("输入异常，请重新输入");
            }
//        } while (true);

    }
}

