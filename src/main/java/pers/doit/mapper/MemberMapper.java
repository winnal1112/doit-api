package pers.doit.mapper;

import org.springframework.stereotype.Repository;
import pers.doit.pojo.Member;

import java.util.List;

@Repository
public interface MemberMapper {
    List<Member> getMemberList();
}
