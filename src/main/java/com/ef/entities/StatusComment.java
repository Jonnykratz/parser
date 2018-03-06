package com.ef.entities;

import javax.persistence.*;

@Entity(name = "status_comment")
public class StatusComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

//    @Column(name = "Code",nullable = false)
    private int code;

//    @Column(name = "Comment",nullable = false)
    private String comment;

    //	@ManyToMany(cascade = {CascadeType.ALL})
////	@JsonBackReference
//	@JoinTable(
//		name = "ipAddresses_statusComments",
//		joinColumns = {
//				@JoinColumn(name = "statusComment_code", referencedColumnName = "statusComment_code")
//		},
//		inverseJoinColumns = @JoinColumn(name = "ipAddress_id", referencedColumnName = "ipAddress_id"))
//	private List<IpAddress> ipAddresses;
//
//	public List<IpAddress> getIpAddresses() {
//		return ipAddresses;
//	}
//	public void setIpAddresses(List<IpAddress> ipAddresses) {
//		this.ipAddresses = ipAddresses;
//	}
    public StatusComment() {
    }

    public StatusComment(int code, String comment) {
        this.code = code;
        this.comment = comment;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
