package cn.lxgandlz.v1;

/**
 * Created by 李新广
 *
 * 2017/3/13 14:26
 *
 * http://lxgandlz.cn
 *
 * 最简单的单例模式
 *
 * 首先，私有化构造方法，防止其他类通过new关键字来生成实例
 * 然后在静态方法中判断变量singleton如果为空，就实例化一个，否则就直接返回singleton
 * 缺点：在多线程的情况下，如果线程A和线程B同时判断到singleton为空，那么就会有两个实例会被生成
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

}
