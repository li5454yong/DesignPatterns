package cn.lxgandlz.v3;

/**
 * Created by 李新广
 *
 * 2017/3/13 15:33
 *
 * http://lxgandlz.cn
 *
 * 双重加锁
 */
public class Singleton {
    private static Singleton singleton;

    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }

        }
        return singleton;
    }
}
