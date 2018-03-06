package com.ef.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "ipaddress")
public class IpAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	private Timestamp accessTime;

//	@Column(name="Address",nullable = false)
	private String address;

	public IpAddress() {
	}

	public IpAddress(String address) {
		this.address = address;
	}

	public IpAddress(String address, Timestamp accessTime) {
        this.address = address;
        this.accessTime = accessTime;

    }

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

    public Timestamp getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Timestamp accessTime) {
        this.accessTime = accessTime;
    }
}
