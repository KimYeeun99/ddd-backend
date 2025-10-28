package com.example.dddbackend.member.presentation.controller.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

public record MemberRegistRequest(
        @NotNull
        @Length(max = 20)
        String name,
        @NotNull
        String memberNumber,
        @Email
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
}
