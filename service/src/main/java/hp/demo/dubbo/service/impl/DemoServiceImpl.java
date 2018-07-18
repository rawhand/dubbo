package hp.demo.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import hp.demo.dubbo.service.DemoService;

//@Service(
//        version = "${demo.service.version}",
//        application = "${dubbo.application.id}",
//        protocol = "${dubbo.protocol.id}",
//        registry = "${dubbo.registry.id}"
//)
//@Service(version = "1.0.1")
@Service
public class DemoServiceImpl implements DemoService {
}
