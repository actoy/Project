package com.joker.exercise;

/**
 *  * 实例Conversion
 *  *
 *  * @version 1.0
 *  编写一段代码，实现二进制、十进制、十六进制互转
 */
public class Conversion {
    public static void main(String[] args) {
        int num = 65;
        System.out.println("二进制为：" + trans3(num, 2));
        System.out.println("十六进制为：" + trans3(num, 16));
        num = 0X41;
        System.out.println("十进制为：" + trans3(num, 10));
        num = 0b100000001;
        System.out.println("十进制为：" + trans3(num, 10));
    }

    public static String trans3(int num, int radix)
    {
        //使用StringBuilder的reverse方法
        StringBuilder sb = new StringBuilder();

        while(num > 0)
        {
            //把除以基数的余数存到缓冲区中
            sb.append(num % radix);
            num /= radix;
        }

        return sb.reverse().toString();
    }
}
