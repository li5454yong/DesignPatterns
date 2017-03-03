package cn.lxgandlz;

/**
 * Created by 李新广
 *
 * 2017/3/3 11:35
 *
 * http://lxgandlz.cn
 */
public class FactoryProducer {
    public static AbstractFactory create(Class c){
        try{
            return (AbstractFactory) c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
