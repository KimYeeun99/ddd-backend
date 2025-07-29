package com.example.dddbackend.member.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor
public class Member {
    private Long id;
    //Enum 구현 필요
    private String status;
    private String name;
    private String memberNumber;
}
