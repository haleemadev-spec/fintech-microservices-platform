package com.haleema.fintechmicroservicesplatform;

import org.springframework.boot.SpringApplication;

public class TestFintechMicroservicesPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.from(FintechMicroservicesPlatformApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
