

>### 描述
>* #### 采用zookeeper作为注册中心
>* #### 使用注解配置方式
>* #### spring boot
>* #### dubbo依赖
>> ##### 引用2.6.2版本常规jar包，需要自己配置Protocol、Registry、Consumer等
>> ##### 注：dubbo-spring-boot-starter demo可以参考https://github.com/apache/incubator-dubbo-spring-boot-project/blob/master/README_CN.md

>### 工程结构
>* #### common : 接口模块
>* #### consumer : 消费模块
>* #### service : 服务提供模块

>### 模块说明
>
>* #### common
>> ##### DemoService.java
>> ###### default String sayHello(String name)
>> ###### return：Hello,name (from spring boot)
>
>* #### consumer
>> ##### DemoConsumerController.java
>> ##### RestFul API ： sayHello
>> ##### return：DemoService.sayHello
>
>* #### service
>> ##### DemoServiceImpl.java
>> ##### implements DemoService.java

>### 依赖服务
>* #### zookeeper

