package joker.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *  * 实例WriterDemo
 *  *
 *  * @version 1.0
 *  什么时候需要加flush，什么时候不加flush？
 *     最保险的方式，在输出流关闭之前每次都flush一下，在关闭
 *     当某一个输出流对象中带有缓冲区的时候，就需要进行flush
 */
public class WriterDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("src/joker/stream/write.txt");
        Writer writer = null;
        writer = new FileWriter(file);
        writer.write("joker");
        writer.write("123");
        //可以将数据强制刷写进入文件中
        writer.flush();
        writer.close();
    }
}
