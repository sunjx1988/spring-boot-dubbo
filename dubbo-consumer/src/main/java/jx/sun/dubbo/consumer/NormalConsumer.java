package jx.sun.dubbo.consumer;

import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import com.alibaba.dubbo.config.annotation.Reference;
import jx.sun.dubbo.rmi.AddService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: sunjx
 * @Date: 2018/06/12 11:04
 * @Description: 现状：addService 与asyncAddService 哪个先声明就会使用哪个的注解属性,不支持独立的,是否另建一个消费者解决这个问题？
 */
@Slf4j
@Service
public class NormalConsumer {

    @DubboConsumer(check = false, timeout = 6)
    private AddService addService;

    @DubboConsumer(check = false, timeout = 6, async = true)
    private AddService asyncAddService;

    public void consum(){
        log.info("同步方法开始...");
        addService.method();
        log.info("同步方法结束...");
    }

    public void asyncConsum(){
        log.info("异步方法开始...");
        asyncAddService.method();
        log.info("异步方法结束...");
    }

}
