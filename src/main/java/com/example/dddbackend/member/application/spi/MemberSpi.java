package com.example.dddbackend.member.application.spi;

import com.example.dddbackend.member.domain.Member;
import com.example.dddbackend.member.presentation.controller.model.request.MemberRegistRequest;

public interface MemberSpi {
    Member getMemberById(Long id);
    Member registMember(MemberRegistRequest request);
    void deleteMemberById(Long id);
}
