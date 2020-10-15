package com.joker.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * java中需要读写文件中的数据的话，需要使用流的概念
 *  流表示从一个文件将数据返送到另一个恩建，包含一个流向问题
 *    最终需要选择一个参照物，当前程序作为参照物
 *      从一个文件中读取数据到程序中叫输入流
 *      从程序输出数据到另一个文件叫做输出流
 *
 *  注意：当编写io流的程序的时候一定要注意关闭流
 *      步骤：
 *          1.选择合适的io流对象
 *          2.创建对象
 *          3.传输数据
 *          4.关闭流对象（占用系统资源）
 */
public class InputStreamDemo {

    public static void main(String[] args) throws IOException {
        inputStream();
    }

    private static void inputStream() throws IOException {
        InputStream inputStream = new FileInputStream("src/joker/stream/file_demo.txt");
        // method 1 读取单个输入流
//        int read = inputStream.read();
//        System.out.println((char)read);

        //method 2 循环读取输入流
//        int read = 0;
//        while ((read = inputStream.read()) != -1) {
//            System.out.println((char)read);
//        }

        //method 3 添加缓冲区的方式
//        byte[] buffer = new byte[1024];
//        int length = 0;
//        while ((length = inputStream.read(buffer)) != -1) {
//            System.out.println(new String(buffer, 0, length));
//        }

        //method 4
        byte[] buffer = new byte[1024];
        int length = 0;
        while ((length = inputStream.read(buffer, 5, 5)) != -1) {
            System.out.println(new String(buffer, 5, length));
        }

        inputStream.close();
    }
}
