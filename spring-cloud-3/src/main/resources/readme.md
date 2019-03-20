配置文件:
--------------------------
配置文件格式spring-{profile}.properties
通过spring-profile.active值指定  

一般有三种格式：        
-   spring-dev.properties       
-   spring-test.properties      
-   spring-prod.properties      
-------------------------------


spring boot的属性加载顺序：
-   命令行参数
-   spring-application-json
-   java:comp/env的jndi属性
-   java系统属性,System.getProperties()获得
-   操作系统环境变量
-   通过random.*配置的随机属性
-   位于当前应用jar外，针对不同{profile}环境配置文件(application-{profile}.properties或者yaml)内容
-   位于当前应用jar内，针对不同{profile}环境配置文件(application-{profile}.properties或者yaml)内容
-   位于当前应用jar外的application.properties和yaml的内容
-   位于当前应用jar内的application.properties和yaml的内容
-   在@configuration注解修改的类中，通过@PropertySource注解定义的属性
-   应用默认属性，使用SpringApplication.setDefaultProperties定义
