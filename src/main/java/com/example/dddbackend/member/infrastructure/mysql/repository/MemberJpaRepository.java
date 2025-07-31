package com.example.dddbackend.member.infrastructure.mysql.repository;

import com.example.dddbackend.member.infrastructure.mysql.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJpaRepository extends JpaRepository<MemberEntity, Long> {
}
