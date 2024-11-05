package ObjFrame;


import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class ObjFrame {
    public static void theObjFrame(Object obj) throws Exception {
        //先创建一个打印流，方便后面写入文件,以文件流为低级包装，采用追加
        PrintStream ps = new PrintStream(new FileOutputStream("src\\a.txt",true));

        //获取类对象,可以把具体的类拿出来
        Class<?> objClass = obj.getClass();
        String objClassName = objClass.getName();
        ps.println();
        ps.println("-----------" + objClassName + "--------------");
        //获取类的字段
        for (Field field : objClass.getDeclaredFields()) {
            String name = field.getName();

            field.setAccessible(true);//一般field都是私有的，暴力检查
            Object val = field.get(obj);//获取值一定是传入对象

            //将字段写入文件
            ps.println(name + " :" + val);
        }
        ps.close();
    }
}
