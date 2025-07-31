package com.example.dddbackend.member.application;

import com.example.dddbackend.member.application.api.MemberApi;
import com.example.dddbackend.member.application.spi.MemberSpi;
import com.example.dddbackend.member.presentation.controller.model.request.MemberRegistRequest;
import com.example.dddbackend.member.presentation.controller.model.response.MemberResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberAssembler implements MemberApi {
    private final MemberSpi memberSpi;
    @Override
    public MemberResponse getMemberById(Long id) {
        return MemberResponse.of(memberSpi.getMemberById(id));
    }

    @Override
    public void registerMember(MemberRegistRequest request) {

    }
}
