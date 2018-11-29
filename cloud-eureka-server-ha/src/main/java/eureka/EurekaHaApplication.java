package eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by sunmood on 2018/11/28.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaHaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaHaApplication.class, args);
    }
}
