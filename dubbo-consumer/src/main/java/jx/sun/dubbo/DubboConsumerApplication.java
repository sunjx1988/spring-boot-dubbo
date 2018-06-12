package jx.sun.dubbo;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import jx.sun.dubbo.consumer.NormalConsumer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: sunjx
 * @Date: 2018/06/12 10:38
 * @Description:
 */
@Slf4j
@SpringBootApplication
@EnableDubboConfiguration
public class DubboConsumerApplication implements CommandLineRunner{

    @Autowired
    private NormalConsumer normalConsumer;

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(DubboConsumerApplication.class, args);
        log.info("服务调用者关闭...");
        TimeUnit.SECONDS.sleep(10);
    }

    @Override
    public void run(String... strings){
        log.info("服务调用开始...");
        normalConsumer.asyncConsum();
        normalConsumer.consum();
        log.info("服务调用结束...");
    }
}
