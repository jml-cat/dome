package com.demo.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @客户
 */
public class CheckIn implements Serializable{

    private Integer cid;//客户id
    private String name;//姓名
    private Date checkinTime;//入住时间
    private Integer num;//入住天数
    private String state;//结账情况
    private Room room;//房间

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCheckinTime() {
        return checkinTime;
    }

    public void setCheckinTime(Date checkinTime) {
        this.checkinTime = checkinTime;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
