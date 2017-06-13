package com.cn.uuu.pojo;

public class Address {
	@Override
	public String toString() {
		return "Address [province=" + province + ", city=" + city + "]";
	}
	private String province;
	private String city;
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
