package com.joker.net.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *  * 实例client
 *  *
 *  * @version 1.0
 *  
 */
public class client {

    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1", 10);

        OutputStream outputStream = client.getOutputStream();

        outputStream.write("hello".getBytes());

        InputStream inputStream = client.getInputStream();
        byte[] buf = new byte[1024];
        int length = inputStream.read(buf);
        System.out.println("server response is " + new String(buf, 0, length));

        inputStream.close();
        outputStream.close();
        client.close();
    }
}
