package com.sunmood.consumermovie;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该类为ribbon的配置类
 * Created by sunmood on 2018/12/4.
 */
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule(){
        // 负载均衡规则，改为随机
        return new RandomRule();
    }
}
