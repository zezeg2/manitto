package com.example.manitto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import retrofit2.Retrofit;

@EnableScheduling
@SpringBootApplication
@MapperScan(basePackages = "com.example.manitto.repositories")
public class ManittoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManittoApplication.class, args);
    }

    @Bean
    public Retrofit.Builder apiClient() {
        return new Retrofit.Builder();
    }

}
