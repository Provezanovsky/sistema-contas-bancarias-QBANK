package com.qbank.modulo_contas.controller;

import com.qbank.modulo_contas.model.Account;
import com.qbank.modulo_contas.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Define esta classe como um controlador REST
@RequestMapping("/accounts") // Define o caminho base para os endpoints
public class AccountController {
    private final AccountService accountService;

    // Injeção de dependência do serviço
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // Endpoint para listar todas as contas
    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    // Endpoint para buscar uma conta pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable Long id) {
        return ResponseEntity.ok(accountService.getAccountById(id));
    }

    // Endpoint para criar uma nova conta
    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.createAccount(account));
    }

    // Endpoint para atualizar uma conta existente
    @PutMapping("/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable Long id, @RequestBody Account account) {
        return ResponseEntity.ok(accountService.updateAccount(id, account));
    }

    // Endpoint para deletar uma conta pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable Long id) {
        accountService.deleteAccount(id);
        return ResponseEntity.noContent().build();
    }
}
