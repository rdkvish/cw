package com.rdkv.cwdemo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "userinformation")
public class UserInfo {

	@Id
	@Column(name = "mobilenumber")
	private String mobileNumber;

	@Column(name = "otp")
	private String otp;

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof UserInfo)) return false;
		UserInfo userInfo = (UserInfo) o;
		return mobileNumber.equals(userInfo.mobileNumber) &&
				otp.equals(userInfo.otp);
	}

	@Override
	public int hashCode() {
		return Objects.hash(mobileNumber, otp);
	}

	@Override
	public String toString() {
		return "UserInfo{" +
				"mobileNumber='" + mobileNumber + '\'' +
				", otp='" + otp + '\'' +
				'}';
	}
}
