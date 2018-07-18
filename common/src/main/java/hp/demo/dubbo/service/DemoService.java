package hp.demo.dubbo.service;

public interface DemoService {

    default String sayHello(String name) {
        return "Hello," + name + " (from spring boot)";
    }
}
