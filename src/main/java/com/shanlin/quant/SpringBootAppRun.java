package com.shanlin.quant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 默认端口8080
 */
@SpringBootApplication
public class SpringBootAppRun {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppRun.class, args);
	}

}
