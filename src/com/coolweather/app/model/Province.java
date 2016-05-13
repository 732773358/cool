package com.coolweather.app.model;

import com.coolweather.app.R.string;

public class Province {

	public Province() {
		// TODO 自动生成的构造函数存根
	}
	
	private int id;
	private String ProvinceName;
	private String ProvinceCode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvinceName() {
		return ProvinceName;
	}
	public void setProvinceName(String provinceName) {
		ProvinceName = provinceName;
	}
	public String getProvinceCode() {
		return ProvinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		ProvinceCode = provinceCode;
	}


}
