package my.basic;

import java.util.Scanner;

/**
 *  * 实例DataType
 *  *
 *  * @version 1.0
 *  
 */
public class DataType {
    public static void main(String[] args) {
//        testPerson();

//        testCircle();

//        testDeposit();

        testEncryption();
    }

    public static void testPerson() {
        System.out.println("Please input your name here:");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Please input your age here:");
        int age = input.nextInt();

        System.out.println("Please input your gender here:");
        String gender = input.next();

        System.out.println("The computer recorded that ：");
        System.out.println("Your nanme is：" + name);
        System.out.println("Your age is：" + age);
        System.out.println("Your gender is：" + gender);
    }

    public static void testCircle() {
        final double PI = 3.14;
        System.out.println("请输入圆的半径:");
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        System.out.println("该圆的半为: R=" + r);
        System.out.println("该圆的周长为: C=2*" + PI + "*" + r + "=" + 2 * PI * r);
        System.out.println("该圆的面积为: S=" + PI + "*" + r + "*" + r + "=" + r * r * PI);
    }

    public static void testDeposit() {
        int money = 10000;
        System.out.println("本金: "+money);
        System.out.println("活期1年本金总计: "+Math.round(money + money * 0.35 / 100));
        System.out.println("定期1年本金总计: "+Math.round(money + money * 1.50 / 100));
        System.out.println("活期2年本金总计: "+Math.round(money + money * 0.35 * 2 / 100));
        System.out.println("定期2年本金总计: "+Math.round(money + money * 2.10 * 2 / 100));
    }

    public static void testEncryption() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个4位正整数：");
        int num = s.nextInt();
        int bit1 = num / 1000;
        int bit2 = num / 100 % 10;
        int bit3 = num / 10 % 10;
        int bit4 = num % 10;
        bit1 = (bit1 + 5) % 10;
        bit2 = (bit2 + 5) % 10;
        bit3 = (bit3 + 5) % 10;
        bit4 = (bit4 + 5) % 10;
        int screct = bit4 * 1000 + bit3 * 100 + bit2 * 10 + bit1;
        System.out.println("加密后的数字为："+ screct);
    }

}
