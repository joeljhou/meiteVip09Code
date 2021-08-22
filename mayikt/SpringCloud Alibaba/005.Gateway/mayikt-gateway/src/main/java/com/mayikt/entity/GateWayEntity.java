package com.mayikt.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author 周宇
 * @create 2021-08-23 1:02
 */
@Component
@Data
public class GateWayEntity {
    private Integer id;
    private String routeId;
    private String routeName;
    private String routePattern;
    /**
     * 路由类型
     * 0的话 则从注册中心获取服务
     */
    private String routeType;
    private String routeUrl;
}
