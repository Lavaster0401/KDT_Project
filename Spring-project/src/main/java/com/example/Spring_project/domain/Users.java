package com.example.Spring_project.domain;

public class Users {
    private Long userIdx;   // DB PK 용도
    private String userId;  // 로그인 아이디
    private String userName;// 사용자 이름

    public Long getUserIdx() {
        return userIdx;
    }

    public void setUserIdx(Long userIdx) {
        this.userIdx = userIdx;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
