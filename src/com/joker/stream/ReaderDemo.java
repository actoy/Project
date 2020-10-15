package com.joker.stream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *  * 实例ReaderDemo
 *  *
 *  * @version 1.0
 *  
 */
public class ReaderDemo {
    public static void main(String[] args) throws IOException {
//        testRead();
        cycle();
    }

    static void testRead() throws IOException {
        Reader reader = new FileReader("src/joker/stream/file_demo.txt");
        int read = reader.read();
        System.out.println((char)read);

        reader.close();
    }

    static void cycle() throws IOException {
        //method 1
        Reader reader = new FileReader("src/joker/stream/file_demo.txt");
        int length = 0;
//        while ((length = reader.read()) != -1) {
//            System.out.println((char)length);
//        }

        //method 2
        char[] chars = new char[1024];
        while ((length = reader.read(chars)) != -1) {
            System.out.println(new String(chars, 0, length));
        }

        reader.close();
    }
}
