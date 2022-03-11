package pers.doit.service;

import org.springframework.stereotype.Service;
import pers.doit.pojo.Member;
import pers.doit.pojo.MemberSearchParams;

import java.util.List;

@Service
public interface MemberService {
    List<Member> getMemberList(MemberSearchParams params);
    Integer getMemberTotalCount(MemberSearchParams params);
}
