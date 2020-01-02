package io.wesquad.bankaccountmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public abstract class Transaction {
    @Id
    @GeneratedValue
    private long transactionId;
    @ManyToOne
    @JoinColumn
    private Account target;
    private TransactionType type;
    private BigDecimal amount;
    private LocalDate actionDate;

}
