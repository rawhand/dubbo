package hp.demo.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import hp.demo.dubbo.service.DemoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConsumerController {

//    @Reference(version = "1.0.0")
    @Reference
    private DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String  name) {
        return demoService.sayHello(name);
    }
}
