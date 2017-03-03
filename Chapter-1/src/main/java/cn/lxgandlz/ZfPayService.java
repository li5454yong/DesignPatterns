package cn.lxgandlz;

/**
 * Created by 李新广
 *
 * 2017/3/2 21:18
 *
 * http://lxgandlz.cn
 */
public class ZfPayService implements PayService {
    public void saveLog() {
        System.out.println("支付宝。。。。。。。。。。saveLog");
    }

    public void pay() {
        System.out.println("支付宝。。。。。。。。。。pay");
    }

    public void updateOrder() {
        System.out.println("支付宝。。。。。。。。。。updateOrder");
    }
}
