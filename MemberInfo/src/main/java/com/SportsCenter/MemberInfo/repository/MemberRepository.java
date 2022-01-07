package com.SportsCenter.MemberInfo.repository;

import com.SportsCenter.MemberInfo.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);  //회원가입 고객정보 등록
    Optional<Member> findById(String id);  //로그인, 아이디 확인
   Optional<Member> findByPw(String pw); //로그인, 비밀번호 확인
   List<Member> findAll(); //관리자형에서 고객정보 다 확인할때 확인

}
