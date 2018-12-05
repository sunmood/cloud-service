package com.sunmood.consumermovie;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * 使用RibbonClient，为特定name的ribbon client自定义配置。
 * 使用@RibbonClient的configuration属性，指定Ribbon的配置类
 * Created by sunmood on 2018/12/4.
 */
@Configuration
@RibbonClient(name = "CLOUD-PROVIDER-USER", configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
