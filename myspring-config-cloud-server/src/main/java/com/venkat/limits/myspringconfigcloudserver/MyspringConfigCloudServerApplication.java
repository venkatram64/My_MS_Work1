package com.venkat.limits.myspringconfigcloudserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MyspringConfigCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringConfigCloudServerApplication.class, args);
	}

}
