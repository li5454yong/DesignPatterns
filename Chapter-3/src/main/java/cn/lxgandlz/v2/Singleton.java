package cn.lxgandlz.v2;

/**
 * Created by 李新广
 *
 * 2017/3/13 14:59
 *
 * http://lxgandlz.cn
 *
 * 在getSingleton方法上加上synchronized
 * 优点：可以保证每次进入方法的只有一个线程，不会出现Singleton被多次实例化的情况
 * 缺点：第一个线程执行完方法，Singleton已被实例化，但是后续的线程还是需要逐个等待获取锁才能执行。
 * 但是，事实上Singleton已经被实例化，其他线程只需要返回这个实例即可，这样就造成了无关的等待
 */
public class Singleton {
    private static Singleton singleton;

    public static synchronized Singleton getSingleton(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
