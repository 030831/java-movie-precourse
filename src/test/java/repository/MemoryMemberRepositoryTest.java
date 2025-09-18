package repository;

import member.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MemoryMemberRepositoryTest {

    MemoryMemberRepository memberRepository = new MemoryMemberRepository();

    @AfterEach
    void afterEach() {
        memberRepository.clearRepository();
    }

    @Test
    void save() {
        Member member = new Member(1L , "A");

        Assertions.assertThrows(IllegalStateException.class, () -> {
            memberRepository.save(member);
            memberRepository.save(member);
        });
    }

    @Test
    void findById() {
        Member member = new Member(1L , "A");
        memberRepository.save(member);

        Assertions.assertEquals(member , memberRepository.findById(member.getId()));
    }
}