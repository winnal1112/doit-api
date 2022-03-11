package pers.doit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.doit.pojo.Member;
import pers.doit.pojo.MemberResult;
import pers.doit.pojo.MemberSearchParams;
import pers.doit.service.MemberService;

import java.util.List;

@RestController
@CrossOrigin
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/member")
    public MemberResult getMemberList(MemberSearchParams params) {
        System.out.println(params.toString());
        // 取得分页查询数据
        List<Member> result = memberService.getMemberList(params);
        // 取得分页查询数据的总条数
        int totalCount = memberService.getMemberTotalCount(params);
        MemberResult memberResult = new MemberResult();
        memberResult.setLimit(params.getLimit());
        memberResult.setOffset(params.getOffset());
        memberResult.setTotalCount(totalCount);
        if(result != null) {
            memberResult.setList(result);
        }
        return memberResult;
    }
}
