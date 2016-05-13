package com.coolweather.app.model;

public class City {

	private int id;
	private String cityName;
	private String cityCode;
	private int provinceId;
	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id 要设置的 id
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName 要设置的 cityName
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return cityCode
	 */
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * @param cityCode 要设置的 cityCode
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	/**
	 * @return provinceId
	 */
	public int getProvinceId() {
		return provinceId;
	}
	/**
	 * @param provinceId 要设置的 provinceId
	 */
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
	
	
}
