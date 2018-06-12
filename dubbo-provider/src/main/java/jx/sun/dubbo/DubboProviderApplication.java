package jx.sun.dubbo;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: sunjx
 * @Date: 2018/06/12 10:34
 * @Description:
 */
@Slf4j
@EnableDubboConfiguration
@SpringBootApplication
public class DubboProviderApplication implements CommandLineRunner{

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }

    @Override
    public void run(String... strings) {
        log.info("服务提供者启动...");
    }
}

