package pers.doit.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.doit.mapper.MemberMapper;
import pers.doit.pojo.Member;
import pers.doit.pojo.MemberSearchParams;
import pers.doit.service.MemberService;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<Member> getMemberList(MemberSearchParams params) {
        return memberMapper.getMemberList(params);
    }

    @Override
    public Integer getMemberTotalCount(MemberSearchParams params) {
        return memberMapper.getMemberTotalCount(params);
    }
}
