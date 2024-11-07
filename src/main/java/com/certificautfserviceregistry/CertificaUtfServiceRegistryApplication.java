package com.certificautfserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CertificaUtfServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CertificaUtfServiceRegistryApplication.class, args);
    }

}
