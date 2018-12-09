package de.msm.msmcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class MsmcenterApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsmcenterApplication.class, args);
	}
}
