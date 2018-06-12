package jx.sun.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import jx.sun.dubbo.rmi.AddService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Auther: sunjx
 * @Date: 2018/06/12 10:31
 * @Description:
 */
@Slf4j
@Component
@Service(interfaceClass = AddService.class)
public class AddServiceImpl implements AddService {

    @Override
    public Integer add(Integer a, Integer b) {
        log.info("add方法被调用");
        return a + b;
    }
}




