package com.example.dddbackend.member.presentation.controller.model.response;

import com.example.dddbackend.member.domain.Member;
import lombok.AccessLevel;
import lombok.Builder;

import java.time.LocalDate;

@Builder(access = AccessLevel.PRIVATE)
public record MemberResponse(
        String name,
        String memberNumber,
        String email,
        String zipcode,
        String address,
        String detailedAddress,
        String mobileNumber,
        String landlineNumber,
        LocalDate registrationDate,
        boolean isSmsSendingAllowed,
        String memo
) {
    public static MemberResponse of(Member member) {
        return MemberResponse.builder()
                .name(member.getName())
                .memberNumber(member.getMemberNumber())
                .build();
    }
}
