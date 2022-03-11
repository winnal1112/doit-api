package pers.doit.mapper;

import org.springframework.stereotype.Repository;
import pers.doit.pojo.Member;
import pers.doit.pojo.MemberSearchParams;

import java.util.List;

@Repository
public interface MemberMapper {
    List<Member> getMemberList(MemberSearchParams params);
    Integer getMemberTotalCount(MemberSearchParams params);
}
