package creator.prototype;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import javax.imageio.IIOException;
import java.io.*;

public abstract class Shape implements  Cloneable, Serializable {

    private  String id;
    protected   String type;

    abstract  void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    //浅拷贝
    @Override
    protected Object clone()  {
       Object clone = null;
       try {
           clone = super.clone();
       }catch (CloneNotSupportedException e) {
           e.printStackTrace();
       }
       return  clone;
    }

    //深拷贝,需要将对象序列化之后再拷贝，实际上是将对象转换成字节，再拷贝，再讲字节转换为对象
    protected  Shape deepClone() {
        //Shape shape = null;
        // 把对象写入到字节流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            // 参数是待写入的输出流，这里使用时内存输出流，用作临时缓存
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            //--------------对象写入成字节流

        // 再把字节流转化为对象

            // 从临时缓存中将数据导入到 内存输入流，再交给对象输入流反序列化
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return  (Shape) ois.readObject();

        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /** 序列化过程
     *  Object---------->ObjectOutputStream(baos)---writeObject()---->ByteArrayOutputStream
     *                                                                  |
     *                                                                  |
     *  Object---------->ObjectInputStream(bais)---readObject()<------ ByteArrayInputStream
     *
     *  注：在对象序列化和反序列化时，都要指明数据流时什么。输出到哪里，从哪里输入，这里使用的内存流，
     *  new ObjectOutputStream(new ByteArrayOutputStream()); 创建一个使用内存流进行对象序列化之后临时存储
     *  new ObjectInputStream(new ByteArrayInputStream()); 创建一个使用内存流进行对象反序列，从内存流读取字节数据
     */

    // 字符流与字节流最大区别，字符流需要 close ，字节流自动close.

    /***
     * 对象序列化是指将一个对象可以转化为二进制的byte流，可以以文件的方式进行保存。
     *
     *        将对象保存在文件的操作叫做对象的序列化操作。
     *
     *        将对象从文件中恢复的操作叫做反序列化操作。
     *
     * 一个对象如果要能序列化，它必须继承Serizliable。在实现序列化是则需要ObjectOurputStream完成，而需要反序列化时则采用ObjectInputStream。
     *
     * ObjectOutputStream 专门用于对象的输出（转换为二进制字节流：序列化操作）操作
     * ObjectInputStream专门用户对象反序列化操作
     *  transient关键字：变量声明为Transient后，该变量不可序列化。
     *
     *  ByteArrayInputStream/ByteArrayOutputStream 内存流
     */

}
