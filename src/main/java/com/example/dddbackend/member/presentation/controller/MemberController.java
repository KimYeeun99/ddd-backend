package com.example.dddbackend.member.presentation.controller;

import com.example.dddbackend.member.application.api.MemberApi;
import com.example.dddbackend.member.presentation.controller.model.response.MemberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberController {
    private final MemberApi memberApi;

    public ResponseEntity<MemberResponse> getMemberById(Long id) {
        return ResponseEntity.ok(memberApi.getMemberById(id));
    }

}
