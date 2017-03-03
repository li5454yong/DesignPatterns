package cn.lxgandlz;

/**
 * Created by 李新广
 *
 * 2017/3/2 21:32
 *
 * http://lxgandlz.cn
 */
public class PayServiceFactory {

    public static PayService create(Class c){
        try {
            return (PayService)c.newInstance();
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
