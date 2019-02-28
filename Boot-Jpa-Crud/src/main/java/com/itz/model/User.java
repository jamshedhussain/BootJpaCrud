package com.itz.model;

public class User {
	
	private Integer uId;
	private String uName;
	private String uAdd;
	
	//Setter And Getter
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuAdd() {
		return uAdd;
	}
	public void setuAdd(String uAdd) {
		this.uAdd = uAdd;
	}
	
	//ToString
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uAdd=" + uAdd + "]";
	}
	
}//EndOfClass
