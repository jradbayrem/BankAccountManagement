package io.wesquad.bankaccountmanagement.repository;

import io.wesquad.bankaccountmanagement.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
