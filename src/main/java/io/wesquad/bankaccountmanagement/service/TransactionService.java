package io.wesquad.bankaccountmanagement.service;

import io.wesquad.bankaccountmanagement.entity.Account;
import io.wesquad.bankaccountmanagement.entity.Transaction;
import io.wesquad.bankaccountmanagement.exception.transaction.TransactionNotAllowedException;

import java.math.BigDecimal;

public interface TransactionService {
    public Transaction deposit(long accountId, BigDecimal amount) throws TransactionNotAllowedException;
}
