package com.uin.algorithm.uin.test;

/**
 * @author wanglufei
 * @description: TODO
 * @date 2022/2/19/2:34 PM
 */
public class test {
    public static void main(String[] args) {
        System.out.println(getValue(2));
    }

    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
                break;
            case 3:
                result = result + i * 3;
        }
        return result;
    }
}
