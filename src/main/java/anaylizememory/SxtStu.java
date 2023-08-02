package anaylizememory;
/**
 * 1. 类信息首先加载到内存的方法区method area 中 --> study() and kickball() || 常量池(学习 || 踢球 || cherno) || static属性方法-->main()
 * 2. 执行main方法，在栈stack中开辟栈帧，一个方法对应一个栈帧
 * 3. 执行main方法内部具体代码
 *    new SxtStu对象，通过具体的构造器constructor在堆heap构造相应的对象属性和方法，其中方法直接调用方法区method area中存储的方法
 */


/**
 * 学生类
 */
public class SxtStu
{
    int id;
    int age;
    String sname;

    public void study()
    {
        System.out.println("学习");
    }

    public void kickball()
    {
        System.out.println("踢球");
    }

    /**
     * 程序运行的第一推动力
     * @param args
     */
    public static void main(String[] args)
    {
        SxtStu s1 = new SxtStu();
        System.out.println(s1.id);
        System.out.println(s1.sname);
        s1.id = 1001;
        s1.sname = "cherno";
        System.out.println(s1.id);
        System.out.println(s1.sname);
    }
}
