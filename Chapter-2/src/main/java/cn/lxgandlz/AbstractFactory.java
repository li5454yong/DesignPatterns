package cn.lxgandlz;


import cn.lxgandlz.color.Color;
import cn.lxgandlz.shape.Shape;

/**
 * Created by 李新广
 *
 * 2017/3/3 11:17
 *
 * http://lxgandlz.cn
 */
public interface AbstractFactory {
    Shape getShape(Class c);
    Color getColor(Class c);
}
