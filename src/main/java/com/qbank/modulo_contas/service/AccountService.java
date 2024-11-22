package com.qbank.modulo_contas.service;

import com.qbank.modulo_contas.model.Account;
import com.qbank.modulo_contas.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    // Injeção de dependência do repositório
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    // Método para listar todas as contas
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    // Método para buscar uma conta pelo ID
    public Account getAccountById(Long id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Conta não encontrada"));
    }

    // Método para criar uma nova conta
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    // Método para atualizar uma conta existente
    public Account updateAccount(Long id, Account account) {
        Account existingAccount = getAccountById(id); // Busca a conta pelo ID
        existingAccount.setHolderName(account.getHolderName());
        existingAccount.setAccountNumber(account.getAccountNumber());
        existingAccount.setBalance(account.getBalance());
        return accountRepository.save(existingAccount);
    }

    // Método para deletar uma conta pelo ID
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }
}
