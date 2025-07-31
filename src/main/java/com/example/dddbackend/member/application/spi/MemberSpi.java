package com.example.dddbackend.member.application.spi;

import com.example.dddbackend.member.domain.Member;

public interface MemberSpi {
    Member getMemberById(Long id);
}
