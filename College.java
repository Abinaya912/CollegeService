package com.mvit.collegeservice;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class College {

	@Id
	@Column(name="cid")
	private int cid;

	@Column(name="cname")
	private String cname;
	
	@Column(name="address")
	private String address;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
	}
	
}
