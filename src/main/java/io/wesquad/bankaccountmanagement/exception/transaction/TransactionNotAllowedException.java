package io.wesquad.bankaccountmanagement.exception.transaction;


public class TransactionNotAllowedException extends TransactionException {
    public TransactionNotAllowedException(String message){
        super(message);
    }
}
