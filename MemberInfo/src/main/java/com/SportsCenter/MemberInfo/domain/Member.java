package com.SportsCenter.MemberInfo.domain;

import java.util.Date;

public class Member {
    //스포츠센터 회원가입시에 필요한 고객정보
    private String id; //아이디
    private String  pw; //비밀번호
    private String name; //이름
    private Date date; //생년월일
    private char gender; //성별
    private String address; //주소
    private String number;//휴대전화번호
    private  String email; //이메일

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
