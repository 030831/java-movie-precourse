package repository;

import member.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static final Map<Long, Member> memberRepository = new HashMap<>();

    @Override
    public void save(Member member) {
        if (memberRepository.containsKey(member.getId())) {
            throw new IllegalStateException("이미 존재하는 id 입니다.");
        }

        memberRepository.put(member.getId() ,member);
    }

    @Override
    public Member findById(Long id) {
        return memberRepository.get(id);
    }

    public void clearRepository() {
        memberRepository.clear();
    }
}
