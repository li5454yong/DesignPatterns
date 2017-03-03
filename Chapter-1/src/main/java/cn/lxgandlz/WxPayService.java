package cn.lxgandlz;

/**
 * Created by 李新广
 *
 * 2017/3/2 21:25
 *
 * http://lxgandlz.cn
 */
public class WxPayService implements PayService {
    public void saveLog() {
        System.out.println("微信。。。。。。。。。。saveLog");
    }

    public void pay() {
        System.out.println("微信。。。。。。。。。。pay");
    }

    public void updateOrder() {
        System.out.println("微信。。。。。。。。。。updateOrder");
    }
}
