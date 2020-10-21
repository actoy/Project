package com.joker.javase.iostream;

import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        test();
    }

    static void test() throws IOException{
        File file = new File("src/joker/iostream/out.txt");
        OutputStream outputStream = null;
        outputStream = new FileOutputStream(file);
        outputStream.write(97);
        outputStream.write("\r\njoker".getBytes());

        outputStream.close();
    }
}
