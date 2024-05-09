package com.coding.data;

import java.util.List;
import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "com.nit")
public class MyDataRunner implements CommandLineRunner{

	private int id;
	private String code;
	
	
	private List<String> list;
	
	private Map<String,Double> version;
	
	
	@Override
	public String toString() {
		return "MyDataRunner [id=" + id + ", code=" + code + ", list=" + list + ", version=" + version + "]";
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public List<String> getList() {
		return list;
	}


	public void setList(List<String> list) {
		this.list = list;
	}


	public Map<String, Double> getVersion() {
		return version;
	}


	public void setVersion(Map<String, Double> version) {
		this.version = version;
	}

	
	

}
