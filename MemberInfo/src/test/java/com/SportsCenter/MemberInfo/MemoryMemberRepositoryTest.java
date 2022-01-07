package com.SportsCenter.MemberInfo;

import com.SportsCenter.MemberInfo.domain.Member;
import com.SportsCenter.MemberInfo.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();
    //저장만 확인
    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }
    @Test
    public void save() {
        //given
        Member member = new Member();
        member.setId("aespa");
        //when
        repository.save(member);
        //then
        Member result = repository.findById(member.getId()).get();
       assertThat(result).isEqualTo(member);
    }
}
