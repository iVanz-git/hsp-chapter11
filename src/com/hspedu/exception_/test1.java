package com.hspedu.exception_;

/**
 * @author iVan
 */
public class test1 {
    public static void main(String[] args) {

//        int a = 6;
//        A1.k1(a);//方法并不能修改参数值
//        System.out.println(a);//a依然是6

          //1.
//        String str1 = "zhangsan";
//        String str2 = "zhang" + "san";
//        System.out.println("1:" + (str1 == str2));//T
//
//        //2.
//        int age = 10;
//        String str3 = "zhangsan" + age;
//        String str4 = "zhangsan10";
//        System.out.println("2:" + (str3 == str4));//F
//
//
//        //3.
//        final int age1 = 10;
//        String str5 = "zhangsan" + age1;
//        String str6 = "zhangsan10";
//        System.out.println("3:" + (str5 == str6));//T
//
//
//        //4.
//        String str7 = new String("zhangsan");
//        String str8 = "zhangsan";
//        System.out.println("4:" + (str7 == str8));//F


//        //5.
//        String str9 = "zhangsan";
//        String str10 = new StringBuilder("zhang").append("san").toString();
//        System.out.println("5:" + (str9 == str10));//F

//        //6.
//        String s11 = "zhangsan";
//        System.out.println("6:" + (s11.intern() == s11));//T


//        //7.
//        String s12 = new String("zhangsan");
//        System.out.println("7:" + (s12.intern() == s12));//F

//        //8.
//        String s13 = "zhang";
//        String s14 = s13 + "s" + "an";
//        String s15 = new StringBuilder("s").append("an").toString();
//        System.out.println("8:" + (s15.intern() == s14));//F

//        //9.
//        String s16 = new StringBuilder("zhang").append("san").toString();
//        System.out.println("9:" + (s16.intern() == s16));//T

        //10.
        String s20 = new StringBuilder("open").append("jdk").toString();
        System.out.println("10:" + (s20.intern()==s20));//F
//
        /**
         *==============!!!!!重要开始!!!!!=============
         * 下面为原教程中的代码，本应该返回F，但在我这里运行为T，经过群友讨论，最终发现原因：
         * 因为我的jdk是openjdk,查看源码 system下的sun.misc.Version.init() 方法中
         * Version类里面没有定义luncher_name="java"这个常量，取而代之的是luncher_name="openjdk"
         * 尝试用"openjdk"做验证第十题，果然正常返回false，如上题目。
         *==============!!!!!重要结束!!!!!=============
         */
//        String s1 = new StringBuilder("ja").append("va").toString();
//        System.out.println(s1.intern() == s1);//T,


    }
}

//class A1{
//    public static void k1(int n){
//        n = 2;
//    }
//}
