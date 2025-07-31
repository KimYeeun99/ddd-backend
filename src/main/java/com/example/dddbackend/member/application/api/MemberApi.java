package com.example.dddbackend.member.application.api;

import com.example.dddbackend.member.presentation.controller.model.request.MemberRegistRequest;
import com.example.dddbackend.member.presentation.controller.model.response.MemberResponse;

public interface MemberApi {
    MemberResponse getMemberById(Long id);
    void registerMember(MemberRegistRequest request);
}
