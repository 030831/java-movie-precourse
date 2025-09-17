package repository;

import member.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> memberRepository = new HashMap<>();

    @Override
    public void save(Member member) {

        if (memberRepository.containsKey(member.getId())) {
            throw new IllegalStateException("이미 존재하는 아이디 입니다 : "  + member.getId());
        }
        memberRepository.put(member.getId() , member);
    }

    @Override
    public Member findById(Long memberId) {
        return memberRepository.get(memberId);
    }

    public void clearRepository() {
        memberRepository.clear();
    }
}
