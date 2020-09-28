package joker.stream;

import java.io.File;
import java.io.IOException;

/**
 * FIle提供了对当前文件系统中文件的部分操作
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("src/joker/stream/file_demo.txt");

        //create file
        file.createNewFile();

        //判断文件的属性，都返回boolean类型的值
        file.canExecute();
        file.canRead();
        file.canWrite();

        //判断当前文件是否存在
        System.out.println(file.exists());

        //获取文件名称
        System.out.println(file.getName());
        //获取文件的绝对路径
        System.out.println(file.getAbsolutePath());
        //获取文件的父路径名称，如果文件的路径中只包含文件名称，则显示空
        System.out.println(file.getParent());
        //返回文件绝对路径的规范值
        System.out.println(file.getCanonicalPath());
        //返回操作系统的文件分隔符
        System.out.println(File.separator);
        //判断文件是否是文件，还是目录
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        //循环遍历输出C盘的所有文件的绝对路径
         printFile(new File("c:/"));
    }

    /**
     * 如果当前磁盘下存在无权访问的文件，将会抛出NPE
     * @param file
     */
    static void printFile(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                printFile(f);
            }
        } else {
            System.out.println(file.getAbsolutePath());
        }
    }
}
