package io.wesquad.bankaccountmanagement.service.impl;

import io.wesquad.bankaccountmanagement.entity.Account;
import io.wesquad.bankaccountmanagement.exception.account.AccountNotFoundException;
import io.wesquad.bankaccountmanagement.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public Account findById(long accountId) throws AccountNotFoundException {
        return null;
    }

}
