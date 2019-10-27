package how2java.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * throws与throw这两个关键字接近，不过意义不一样，有如下区别：
 * 1. throws 出现在方法声明上，而throw通常都出现在方法体内。
 * 2. throws 表示出现异常的一种可能性，并不一定会发生这些异常；throw则是抛出了异常，执行throw则一定抛出了某个异常对象。
 */

public class TestException<method3> {
    public static void main(String[] args)  {
        File f = new File("F:/JavaProject/a.txt");

        int num = method3();
        System.out.println("num---->"+num);

        try {
            System.out.println("试图打开 F:/JavaProject/a.txt");
            new FileInputStream(f);
            System.out.println("open successfully");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("无论如何，都执行");
        }
    }

    public static void method1() {
        try {
            method2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void method2() throws FileNotFoundException {
        File f = new File("");
        new FileInputStream(f);
    }

    public static int method3() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        }
        finally {
            return 3;
        }
    }
}
