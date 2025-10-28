package com.example.dddbackend.member.infrastructure.mysql.repository;

import com.example.dddbackend.common.exception.CommonException;
import com.example.dddbackend.common.exception.ExceptionCode;
import com.example.dddbackend.member.application.spi.MemberSpi;
import com.example.dddbackend.member.domain.Member;
import com.example.dddbackend.member.infrastructure.mysql.entity.MemberEntity;
import com.example.dddbackend.member.presentation.controller.model.request.MemberRegistRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository implements MemberSpi {
    private final MemberJpaRepository repository;
    @Override
    public Member getMemberById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new CommonException(ExceptionCode.NOT_FOUND))
                .toDomain();
    }

    @Override
    public Member registMember(MemberRegistRequest request) {
        return repository.save(MemberEntity.create(request)).toDomain();
    }

    @Override
    public void deleteMemberById(Long id) {
        repository.deleteById(id);
    }
}
