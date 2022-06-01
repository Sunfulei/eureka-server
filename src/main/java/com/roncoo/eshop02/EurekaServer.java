package com.roncoo.eshop02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {
    public static void main(String[] args){
        SpringApplication.run(EurekaServer.class, args);
    }


    /*
    * #security:
  #basic:
    #enabled: true
  #user:
    #name: admin
    #password: 123456
    * */
}
