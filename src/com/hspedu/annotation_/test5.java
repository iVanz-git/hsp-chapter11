package com.hspedu.annotation_;

/**
 * @author iVan
 */
public class test5 {
    public static void main(String[] args) {
        String s1 = new StringBuilder("j").append("ava").toString();
        System.out.println(s1 == s1.intern());
    }
}
