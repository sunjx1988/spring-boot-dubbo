package jx.sun.dubbo.consumer;

import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import jx.sun.dubbo.rmi.AddService;
import org.springframework.stereotype.Service;

/**
 * @Auther: sunjx
 * @Date: 2018/06/12 11:04
 * @Description:
 */
@Service
public class NormalConsumer {

    @DubboConsumer(check = false)
    private AddService addService;

    public int consume(int a, int b){
        return addService.add(a, b);
    }
}
