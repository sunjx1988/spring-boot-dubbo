package jx.sun.dubbo;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import jx.sun.dubbo.consumer.NormalConsumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Auther: sunjx
 * @Date: 2018/06/12 10:38
 * @Description:
 */
@Slf4j
@SpringBootApplication
@EnableDubboConfiguration
@EnableAsync
public class DubboConsumerApplication implements CommandLineRunner{

    @Autowired
    private NormalConsumer normalConsumer;

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
        log.info("服务调用者关闭...");
    }

    @Override
    public void run(String... strings){
        log.info("服务调用开始...");
        normalConsumer.consum();
        log.info("服务调用结束...");
    }
}
