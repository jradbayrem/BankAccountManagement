package io.wesquad.bankaccountmanagement.service.impl;

import io.wesquad.bankaccountmanagement.entity.Transaction;
import io.wesquad.bankaccountmanagement.exception.transaction.TransactionNotAllowedException;
import io.wesquad.bankaccountmanagement.service.TransactionService;

import java.math.BigDecimal;

public class TransactionServiceImpl implements TransactionService {
    @Override
    public Transaction deposit(long accountId, BigDecimal amount) throws TransactionNotAllowedException {
        return null;
    }
}
