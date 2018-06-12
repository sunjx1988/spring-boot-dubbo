package jx.sun.dubbo.consumer;

import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import jx.sun.dubbo.rmi.AddService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Auther: sunjx
 * @Date: 2018/06/12 11:04
 * @Description:
 */
@Slf4j
@Service
public class NormalConsumer {

    @DubboConsumer(check = false, timeout = 10000)
    private AddService addService;

    @Async
    public void consum(){
        log.info("异步方法开始...");
        addService.add(1, 2);
        log.info("异步方法结束...");
    }

}
