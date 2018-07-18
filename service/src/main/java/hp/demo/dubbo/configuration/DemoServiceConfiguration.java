package hp.demo.dubbo.configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoServiceConfiguration {

    @ConditionalOnMissingBean(ApplicationConfig.class)
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setId("dubbo-provider-demo-id");
        applicationConfig.setName("dubbo-provider-demo-name");
        return applicationConfig;
    }

    @ConditionalOnMissingBean(ProtocolConfig.class)
    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setPort(12345);
        return protocolConfig;
    }

    @ConditionalOnMissingBean(RegistryConfig.class)
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setId("dubbo-provider-demo-registry-id");
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        return registryConfig;
    }
}
