package com.imooc.luckymoeny;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: DengChen
 * Date: 2019/4/1
 * Time: 13:15
 * code change the world
 */
@Component
@ConfigurationProperties(prefix = "limit")
@Getter
@Setter
public class LimitConfig {

    private BigDecimal minMoney;

    private BigDecimal maxMoney;

    private String description;
}
