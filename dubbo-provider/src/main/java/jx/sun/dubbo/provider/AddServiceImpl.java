package jx.sun.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import jx.sun.dubbo.rmi.AddService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: sunjx
 * @Date: 2018/06/12 10:31
 * @Description:
 */
@Slf4j
@Component
@Service(interfaceClass = AddService.class, dynamic = true)
public class AddServiceImpl implements AddService {

    @Override
    public void method() {
        log.info("方法被调用...");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("方法调用结束...");
    }
}




