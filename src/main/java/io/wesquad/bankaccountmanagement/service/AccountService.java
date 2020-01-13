package io.wesquad.bankaccountmanagement.service;

import io.wesquad.bankaccountmanagement.entity.Account;
import io.wesquad.bankaccountmanagement.exception.account.AccountNotFoundException;

import java.util.Optional;

public interface AccountService {
    public Account findById(long accountId) throws AccountNotFoundException;

}
