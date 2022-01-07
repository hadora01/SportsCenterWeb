package com.SportsCenter.MemberInfo.domain;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member {
    //스포츠센터 회원가입시에 필요한 고객정보
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id; //아이디
    private String  pw; //비밀번호
    private String name; //이름


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


}
