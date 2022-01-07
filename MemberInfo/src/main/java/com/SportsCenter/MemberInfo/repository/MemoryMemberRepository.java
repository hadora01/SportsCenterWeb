package com.SportsCenter.MemberInfo.repository;

import com.SportsCenter.MemberInfo.domain.Member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MemoryMemberRepository implements  MemberRepository{
    private  static Map<String,Member> store = new HashMap<>();

    @Override
    public Member save(Member member) {
        //고객정보 회원가입
        store.put(member.getId(),member);
        return member;
    }

    @Override
    public Optional<Member> findById(String id) {
        return store.values().stream()
                .filter(member -> member.getId().equals(id))
                .findAny();
    }

    @Override
    public Optional<Member> findByPw(String pw) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }

    public void clearStore() {
        store.clear();
    }
}//class
