package com.atdonglijiedian.pojo;

public class Users {
    private int uid;
    private String uname;
    private int uage;

    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                '}';
    }



    public Users(int uid, String uname, int uage) {
        this.uid = uid;
        this.uname = uname;
        this.uage = uage;
    }

    public Users() {
    }
}
