package com.sunmood.consumermovie;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sunmood on 2018/12/4.
 */
@Configuration
@RibbonClient(name = "CLOUD-PROVIDER-USER", configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
