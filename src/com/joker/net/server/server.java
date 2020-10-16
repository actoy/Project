package com.joker.net.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  * 实例server
 *  *
 *  * @version 1.0
 *  
 */
public class server {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10);

        Socket server = serverSocket.accept();

        InputStream inputStream = server.getInputStream();
        byte[] buf = new byte[1024];
        int length = inputStream.read(buf);
        System.out.println("client send is " + new String(buf, 0, length));

        OutputStream outputStream = server.getOutputStream();
        outputStream.write("this is server".getBytes());

        outputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();

    }
}
