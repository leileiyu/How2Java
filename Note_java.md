## Java 基础
### 集合框架
**方法的可变参数**

*可变参的本质就是数组*

可变参数语法: 数据类型...变量名

**可变参数注意事项**

1. 一个方法中，可变参数只能有一个
2. 可变参数必须写在参数列表最后一位

**Colections 工具类**

- Collections.sort 静态方法
- Collections.binarySearch 静态方法
- Collections.shuffle 静态方法 （随机打乱顺序）
```aidl
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(6);
        list.add(20);
        list.add(5);

        int index = Collections.binarySearch(list, 6);
        System.out.println(index);
```
**集合的嵌套**

- ArrayList<ArrayList\<String>>
```java
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String> javase = new HashMap<>();
        HashMap<String, String> javaee = new HashMap<>();

        javase.put("001", "zhangsan");
        javase.put("002", "lisi");

        javaee.put("001", "wangwu");
        javaee.put("002", "zhaoliu");

        HashMap<String, HashMap<String, String>> czbk = new HashMap<>();

        czbk.put("baseClass", javase);
        czbk.put("jobClass", javaee);

//        keySet(czbk);

        entrySet(czbk);
    }
    public static void keySet(HashMap<String, HashMap<String, String>> czbk) {
        Set<String> classNameSet = czbk.keySet();
        Iterator<String> classNameIt = classNameSet.iterator();
        while (classNameIt.hasNext()) {
            String classNameKey = classNameIt.next();
            HashMap<String, String> classMap = czbk.get(classNameKey);
            Set<String> studentNum = classMap.keySet();
            Iterator<String> studentIt = studentNum.iterator();
            while (studentIt.hasNext()) {
                String numkey = studentIt.next();
                String nameVale = classMap.get(numkey);
                System.out.println(classNameKey+"--"+ numkey+ "==" +nameVale);
            }
        }
    }

    public static void entrySet(HashMap<String, HashMap<String, String>> czbk) {
        // 调用集合方法中entrySet 方法，将集合中的键值映射关系，存储到set集合中
        Set<Map.Entry<String, HashMap<String, String>>>
                classNameSet = czbk.entrySet();
        // 迭代器迭代set集合
        Iterator<Map.Entry<String, HashMap<String, String>>> classNameIt = classNameSet.iterator();
        while (classNameIt.hasNext()) {
            Map.Entry<String, HashMap<String, String>> classNameEntry = classNameIt.next();
            String classNameKey = classNameEntry.getKey();
            HashMap<String, String> classMap = classNameEntry.getValue();
            Set<Map.Entry<String, String>> studentSet = classMap.entrySet();
            Iterator<Map.Entry<String, String>> studentIt = studentSet.iterator();
            while (studentIt.hasNext()) {
                // 获取出来的是键值对对象
                Map.Entry<String, String> studentEntry = studentIt.next();
                String numKey = studentEntry.getKey();
                String nameValue = studentEntry.getValue();
                System.out.println(classNameKey+"--"+ numKey+ "==" +nameValue);
            }
        }
    }
}
```

**综合演练--斗地主**



## IO流对象
**File类**  
包名：java.io.File  
系统分隔符：File.*pathSeparator*  
系统有关默认名称分割符：File.*separator*  
win--;--\
linux --:--/  
- File类的创建和删除  
*boolean createNewFile()*  
布尔类型，如果已存在，则创建失败  
只能创建文件，不能创建文件夹   
```
File file = new File("c：\\a.txt");
boolean b = file.creatNewFile();
```
- File创建文件夹  
*boolean mkdir()*  
*boolean mkdirs()*--可递归创建  
- File类删除功能  
*boolean delete()*  
直接从硬盘删除，删除有风险，运行需谨慎  
- File类的获取功能
*String getName()*  
返回路径中表示的文件或者文件夹名  
获取路径中最后部分的名字  
*String getAbsulutePath()*  
*File getAbsuluteFile()*  
- File 类判断功能  
*boolean exit

## 多线程  
*java.lang.thread*  

**两种方法**  
方法一：  
1、声明类为Thead的子类  
2、重写run（）方法  
```java
class PrimeThead extends Thread{
    ...
    public void run(){
    ...
  } 
}
```
方法二：  
1、声明实现Runnable 接口的类  
```java
class PrimeRun implements Runnable{
    ...
}
```
**思考：线程对象调用run方法和调用start方法区别**  
**线程对象调用run方法不开启线程**。仅仅是调用方法，start是开启线程，并让虚拟机调用run方法在开启的线程中执行。  
  
- 获取线程名字Thread类方法  
```java
System.out.println(Thread.currentThread().getName());
```



  














