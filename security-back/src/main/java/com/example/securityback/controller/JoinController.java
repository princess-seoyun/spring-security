package com.example.securityback.controller;

import com.example.securityback.dto.JoinDTO;
import com.example.securityback.service.JoinService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class JoinController {

    private final JoinService joinService;

    // 생성자 주입 방식
    public JoinController(JoinService joinService) {
        this. joinService = joinService;
    }

    @PostMapping("/join")
    public String joinProcess(JoinDTO joinDTO) {

        joinService.joinProcess(joinDTO);

        return "Ok";
    }
}
