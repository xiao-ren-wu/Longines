package com.longines.dto;

import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class Ensure {
    private Integer uId;
    private List<Integer> gId;
    private List<Integer> gNum;
    private List<Integer> mId;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public List<Integer> getgId() {
        return gId;
    }

    public void setgId(List<Integer> gId) {
        this.gId = gId;
    }

    public List<Integer> getgNum() {
        return gNum;
    }

    public void setgNum(List<Integer> gNum) {
        this.gNum = gNum;
    }

    public List<Integer> getmId() {
        return mId;
    }

    public void setmId(List<Integer> mId) {
        this.mId = mId;
    }
}
