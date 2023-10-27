package com.javastart.account.controller.dto;

import com.javastart.account.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;


import java.time.OffsetDateTime;
import java.util.List;

@Getter
@AllArgsConstructor
public class AccountResponceDTO {

    private Long accountId;

    private String name;

    private String email;

    private String phone;

    private OffsetDateTime createDate;

    private List<Long> bills;

    public AccountResponceDTO (Account account){
        accountId = account.getAccountId();
        name = account.getName();
        email = account.getEmail();
        phone = account.getPhone();
        createDate = account.getCreateDate();
        bills = account.getBills();
    }
}
