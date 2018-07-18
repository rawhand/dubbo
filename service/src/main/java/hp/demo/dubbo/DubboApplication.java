package hp.demo.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan(basePackages = "hp.demo.dubbo.service")
public class DubboApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboApplication.class, args);
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(10000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}
