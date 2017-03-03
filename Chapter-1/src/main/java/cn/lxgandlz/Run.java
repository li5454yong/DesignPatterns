package cn.lxgandlz;

/**
 * Created by 李新广
 *
 * 2017/3/3 9:40
 *
 * http://lxgandlz.cn
 */
public class Run {
    public static void main(String[] args){
        PayService payService = PayServiceFactory.create(ZfPayService.class);
        payService.saveLog();
        payService.saveLog();
        payService.updateOrder();
    }
}
