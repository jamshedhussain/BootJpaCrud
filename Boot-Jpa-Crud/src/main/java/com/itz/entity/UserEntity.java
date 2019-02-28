package com.itz.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Table")
public class UserEntity implements Serializable{
	
	@Id
	@Column(name="User_Id")
	private Integer uId;
	
	@Column(name="User_Name")
	private String uName;
	
	@Column(name="User_Add")
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
}
