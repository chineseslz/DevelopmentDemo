package com.atguigu.pojo;

public class Accounts {
    private Integer aid;
    private String aname;
    private String acontent;

    public Accounts() {
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", accountent='" + acontent + '\'' +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAccountent() {
        return acontent;
    }

    public void setAccountent(String accountent) {
        this.acontent = accountent;
    }

    public Accounts(Integer aid, String aname, String accountent) {
        this.aid = aid;
        this.aname = aname;
        this.acontent = accountent;
    }
}
