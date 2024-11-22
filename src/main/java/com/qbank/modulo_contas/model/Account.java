package com.qbank.modulo_contas.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity // Indica que esta classe é uma entidade JPA
@Data   // Gera automaticamente getters, setters, equals, hashCode e toString
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera o ID automaticamente
    private Long id;

    private String holderName;       // Nome do titular da conta
    private String accountNumber;    // Número único da conta
    private BigDecimal balance;      // Saldo da conta
}
