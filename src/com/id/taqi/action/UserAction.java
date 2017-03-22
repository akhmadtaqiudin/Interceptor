package com.id.taqi.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.id.taqi.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private Map<String, Object> session;
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	private boolean isValidateUser(User user){
		if(user.getUserName().equals("admin") && user.getPassword().equals("password")){
			return true;
		}else{
			return false;
		}
	}
	public String logIn(){
		User u = new User(userName,password);
		if(isValidateUser(u)){
			session.put("user", u);
			return SUCCESS;
		}else{
			addFieldError("Invalid", "Maaf Usename dan Password salah");
		}
		return ERROR;
	}
	public String logOut(){
		session.remove("user");
		return SUCCESS;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
