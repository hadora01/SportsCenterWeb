package com.SportsCenter.MemberInfo.service;

import com.SportsCenter.MemberInfo.domain.Member;
import com.SportsCenter.MemberInfo.repository.MemberRepository;
import com.SportsCenter.MemberInfo.repository.MemoryMemberRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class MemberService {

    private final MemberRepository memberRepository ;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


    /**
     * 회원가입
     */
    public String join(Member member) {
      validateDuplicateMember(member); //중복 회원 검증
        memberRepository.save(member);
        return member.getId();
    }


    private void validateDuplicateMember(Member member) {
        memberRepository.findById(member.getId())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }




    public List<Member> findMembers() {
        return memberRepository.findAll();
     }



     }