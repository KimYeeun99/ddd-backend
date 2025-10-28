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
    private String status;
    private String name;
    private String memberNumber;
    private String email;
    private String zipcode;
    private String address;
    private String detailedAddress;
    private String mobileNumber;
    private String landlineNumber;
    private LocalDate registrationDate;
    private boolean isSmsSendingAllowed;
    private String memo;
}
