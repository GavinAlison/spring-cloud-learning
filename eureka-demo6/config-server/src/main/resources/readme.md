Spring Cloud Config也提供本地存储配置的方式。    
我们只需要设置属性spring.profiles.active=native，        
Config Server会默认从应用的src/main/resource目录下检索配置文件。    
也可以通过spring.cloud.config.server.native.searchLocations=file:F:/properties/
属性来指定配置文件的位置。    


1. 启动git版本
spring.profiles.active=remote
git版本控制的配置文件

2. 启动本地
spring.profiles.active=local
