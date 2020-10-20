package com.joker.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *  * 实例CopyFile
 *  *
 *  * @version 1.0
 *  
 */
public class CopyFile {

    public static void main(String[] args) throws IOException {
        //定义源数据文件
        File src = new File("src/joker/iostream/file_demo.txt");
        //定义目的数据文件
        File dest = new File("src/joker/iostream/out.txt");

        //创建输入流对象
        InputStream inputStream = null;
        //创建输出流对象
        OutputStream outputStream = null;

        inputStream = new FileInputStream(src);
        outputStream = new FileOutputStream(dest);

        byte[] buffer = new byte[1024];
        int length = 0;
        while ((length = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer);
        }
        inputStream.close();
        outputStream.close();
    }
}
