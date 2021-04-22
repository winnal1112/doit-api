package pers.doit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.doit.pojo.Member;
import pers.doit.service.MemberService;

import java.util.List;

@RestController
@CrossOrigin
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/member")
    public List<Member> getMemberList() {
        List<Member> memberList = memberService.getMemberList();
        if(memberList != null) {
            System.out.println(memberList.toString());
            return memberList;
        } else{
            return null;
        }

    }
}
