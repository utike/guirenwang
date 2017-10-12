package com.inesv.digiccy.event;

import java.util.Date;

public class UserBasicInfoEvent {
	private int userNo;
	private String nationality;
	private String job;
	private String sex;
	private Date birthday;
	private String userName;
	private String opration;
	private String province;
	private String districts;
	private String cities;
	private String addressInfo;
	public UserBasicInfoEvent() {

	}

	public UserBasicInfoEvent(int userNo, String nationality, String job, String sex, Date birthday, String userName,
			String opration, String province, String districts, String cities, String addressInfo) {
		this.userNo = userNo;
		this.nationality = nationality;
		this.job = job;
		this.sex = sex;
		this.birthday = birthday;
		this.province = province;
		this.districts = districts;
		this.cities = cities;
		this.addressInfo = addressInfo;
		this.opration = opration;
		this.userName = userName;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getOpration() {
		return opration;
	}

	public void setOpration(String opration) {
		this.opration = opration;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getDistricts() {
		return districts;
	}

	public void setDistricts(String districts) {
		this.districts = districts;
	}

	public String getCities() {
		return cities;
	}

	public void setCities(String cities) {
		this.cities = cities;
	}

	public String getAddressInfo() {
		return addressInfo;
	}

	public void setAddressInfo(String addressInfo) {
		this.addressInfo = addressInfo;
	}

}
