package cn.lxgandlz.v4;

/**
 * Created by 李新广
 *
 * 2017/3/13 16:22
 *
 * http://lxgandlz.cn
 */
public class Singleton {


    private Singleton(){}

    public static Singleton getSingleton(){
        return InnerClass.singleton;
    }

    private static class InnerClass{

        static Singleton singleton = new Singleton();
    }
}
