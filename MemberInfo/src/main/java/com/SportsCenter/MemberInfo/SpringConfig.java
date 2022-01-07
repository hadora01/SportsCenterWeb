package com.SportsCenter.MemberInfo;

import com.SportsCenter.MemberInfo.repository.JpaMemberRepository;
import com.SportsCenter.MemberInfo.repository.MemberRepository;
import com.SportsCenter.MemberInfo.repository.MemoryMemberRepository;
import com.SportsCenter.MemberInfo.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private final DataSource dataSource;
    private final EntityManager em;

    public SpringConfig(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em = em;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }
    @Bean
    public MemberRepository memberRepository() {
        //return new MemoryMemberRepository();
        return new JpaMemberRepository(em);
    }

}
