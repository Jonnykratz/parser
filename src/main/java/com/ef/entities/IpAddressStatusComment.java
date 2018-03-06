package com.ef.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "ipaddress_comment")
public class IpAddressStatusComment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IpAddress_ID", nullable = false)
    @JsonIgnore
    private IpAddress ipAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "StatusComment_ID", nullable = false)
    @JsonIgnore
    private StatusComment comment;

    public IpAddressStatusComment() {
    }

    public IpAddressStatusComment(IpAddress ipAddress, StatusComment comment) {
        this.ipAddress = ipAddress;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IpAddress getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(IpAddress ipAddress) {
        this.ipAddress = ipAddress;
    }

    public StatusComment getComment() {
        return comment;
    }

    public void setComment(StatusComment comment) {
        this.comment = comment;
    }
}
