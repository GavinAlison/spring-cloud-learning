gateway 网关服务
包含权限控制(zuulfilter)
服务路由
    服务路由有两种方式： 1. url, 2.serviceId
权限控制
    自定义类继承zuulFilter抽象方法
    重写filterType，filterOrder，shouldFilter, run方法
    生命周期, filterType: pre, routing, post, error
        request-->pre filters --> routing filters --> post filters
                                 error filters

