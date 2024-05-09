package com.coding.model;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class ProductInfo {
	private int pId;
	private String pName;
	private Double pPrice;
	private Map<String,Integer> map;
	
	private List<String> list;

}
