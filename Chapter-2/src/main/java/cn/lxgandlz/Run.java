package cn.lxgandlz;

import cn.lxgandlz.color.Color;
import cn.lxgandlz.color.ColorFactory;
import cn.lxgandlz.color.Green;
import cn.lxgandlz.color.Red;
import cn.lxgandlz.shape.Rectangle;
import cn.lxgandlz.shape.Round;
import cn.lxgandlz.shape.Shape;
import cn.lxgandlz.shape.ShapeFactory;

/**
 * Created by 李新广
 *
 * 2017/3/3 11:42
 *
 * http://lxgandlz.cn
 */
public class Run {
    public static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.create(ShapeFactory.class);
        AbstractFactory colorFactory = FactoryProducer.create(ColorFactory.class);

        Shape round = shapeFactory.getShape(Round.class);
        round.draw();
        Shape rectangle = shapeFactory.getShape(Rectangle.class);
        rectangle.draw();

        Color red = colorFactory.getColor(Red.class);
        red.fill();
        Color green = colorFactory.getColor(Green.class);
        green.fill();
    }
}
