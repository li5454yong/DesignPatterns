package cn.lxgandlz.v3;


import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 李新广
 *
 * 2017/3/13 15:03
 *
 * http://lxgandlz.cn
 */
public class Run {

    private static boolean lock;

    public static void setLock(boolean lock) {
        lock = lock;
    }

    public static boolean isLock(){
        return lock;
    }
    public static void main(String[] args) throws InterruptedException {
        final Set<String> set = new HashSet<String>();
        ExecutorService executorService = Executors.newCachedThreadPool();

        setLock(false);
        for(int i=0; i<100; i++){

            executorService.execute(
                    new Runnable() {
                        public void run() {
                            while (true){
                                if(!isLock()){
                                    Singleton singleton = Singleton.getSingleton();
                                    set.add(singleton.toString());
                                    break;
                                }

                            }
                        }
                    }
            );
        }

        Thread.sleep(5000);
        setLock(true);
        Thread.sleep(5000);

        for(String string : set){
            System.out.println(string);
        }
    }
}
