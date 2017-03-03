package cn.lxgandlz.color;

import cn.lxgandlz.AbstractFactory;
import cn.lxgandlz.shape.Shape;

/**
 * Created by 李新广
 *
 * 2017/3/3 11:08
 *
 * http://lxgandlz.cn
 */
public class ColorFactory implements AbstractFactory{


    public Shape getShape(Class c) {
        return null;
    }

    public Color getColor(Class c) {
        try{
            return (Color)c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
