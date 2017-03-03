package cn.lxgandlz.shape;

import cn.lxgandlz.AbstractFactory;
import cn.lxgandlz.color.Color;

/**
 * Created by 李新广
 *
 * 2017/3/3 10:53
 *
 * http://lxgandlz.cn
 */
public class ShapeFactory implements AbstractFactory {


    public Shape getShape(Class c){

        try{
            return (Shape)c.newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Color getColor(Class c){
        return null;
    }
}
