package com.example.dddbackend.member.infrastructure.mysql.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "member", schema = "ddd-mysql")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class MemberEntity {
    @Id
    private Long id;
    //Enum 구현 필요
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
