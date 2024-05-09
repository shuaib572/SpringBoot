package com.coding.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.coding.model.ProductInfo;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="my.app")
public class BeanReaderRunner implements CommandLineRunner
{

	private ProductInfo pinfo;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}

}
