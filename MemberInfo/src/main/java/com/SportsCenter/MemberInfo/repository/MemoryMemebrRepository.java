package com.SportsCenter.MemberInfo.repository;

import com.SportsCenter.MemberInfo.domain.Member;

import java.util.*;

public class MemoryMemebrRepository implements  MemberRepository {
    private  static Map<String,Member> store = new HashMap<>();

    @Override
    public Member save(Member member) {
        //고객정보 회원가입
        store.put(member.getId(),member);
        return member;
    }


    @Override
    public Optional<Member> findById(String id) {
        //로그인할때 맞는지 아이디 확인시 사용
        return store.values().stream().
                filter(member -> member.getId().equals(id))
                .findAny();
    }

    @Override
    public Optional<Member> findByPw(String pw) {
        //로그인할때 맞는지 비밀번호 확인시 사용
        return store.values().stream().
                filter(member -> member.getPw().equals(pw))
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        //나중에 관리자가 고객정보 모두 볼때 사용
        return new ArrayList<>(store.values());
    }
    public void clearStore(){
        store.clear();
    }

}
