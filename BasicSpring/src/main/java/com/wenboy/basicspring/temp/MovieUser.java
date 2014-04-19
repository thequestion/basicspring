/**
 * 
 */
package com.wenboy.basicspring.temp;

import java.util.Date;

/**
 * @author wenbyuan
 *
 */
public class MovieUser extends User{
	
	private String userFirstName;
	private String userLastName;
	private String userName;
	private String userPassword;
	//private Date userBirthday;
	//private GenderEnum userGender;
	private String userMobilePhone;
	private String userCurrentEmailAddress;
	//private String userLocation;
	
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
//	public Date getUserBirthday() {
//		return userBirthday;
//	}
//	public void setUserBirthday(Date userBirthday) {
//		this.userBirthday = userBirthday;
//	}
//	public GenderEnum getUserGender() {
//		return userGender;
//	}
//	public void setUserGender(GenderEnum userGender) {
//		this.userGender = userGender;
//	}
	public String getUserMobilePhone() {
		return userMobilePhone;
	}
	public void setUserMobilePhone(String userMobilePhone) {
		this.userMobilePhone = userMobilePhone;
	}
	public String getUserCurrentEmailAddress() {
		return userCurrentEmailAddress;
	}
	public void setUserCurrentEmailAddress(String userCurrentEmailAddress) {
		this.userCurrentEmailAddress = userCurrentEmailAddress;
	}
}
