package com.qbank.modulo_contas.repository;

import com.qbank.modulo_contas.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
