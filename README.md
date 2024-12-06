
# Sistema de Gerenciamento de Contas Bancárias

Este é um sistema backend para gerenciar contas bancárias. Ele foi desenvolvido usando **Java** com o framework **Spring Boot** e armazena os dados em um banco de dados H2 (em memória).

---

## Integrantes do Projeto

- Rafael Magalhães Rocha Provezano de Castro - RA: 123113216
- Maria Eduarda Dias de Morais - RA: 12316128
- Rian Douglas Soares Santos - RA: 12316544

---

## Funcionalidades

1. **Criar Contas**: Permite criar uma nova conta bancária fornecendo o nome do titular, número da conta e saldo inicial.
2. **Listar Contas**: Lista todas as contas existentes.
3. **Consultar Conta**: Busca os detalhes de uma conta específica pelo ID.
4. **Atualizar Contas**: Permite modificar os dados de uma conta existente.
5. **Excluir Contas**: Remove uma conta específica pelo ID.

---

## Tecnologias Utilizadas

- **Java 23**: Linguagem de programação principal.
- **Spring Boot 3.4.0**: Framework para desenvolvimento do backend.
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **Lombok**: Biblioteca para reduzir código boilerplate.
- **Maven**: Gerenciador de dependências.

---

## Estrutura do Projeto

```
com.qbank.modulo_contas
├── controller  # Endpoints REST (AccountController)
├── model       # Classe de entidade (Account)
├── repository  # Interface para persistência de dados (AccountRepository)
├── service     # Lógica de negócios (AccountService)
└── ModuloContasApplication.java  # Classe principal do sistema
```

---

## Como Executar o Sistema

### Pré-requisitos

- **Java 23** ou superior instalado no sistema.
- **Maven** instalado para gerenciar dependências.

### Passos para Executar

1. Clone este repositório ou copie o código para sua máquina local.
2. Abra o projeto em sua IDE preferida (Eclipse, IntelliJ, etc.).
3. Configure o Maven para baixar as dependências:
   ```bash
   mvn clean install
   ```
4. Execute a aplicação:
   - A partir da classe `ModuloContasApplication`.
   - Ou usando o Maven:
     ```bash
     mvn spring-boot:run
     ```
5. O servidor será iniciado em: `http://localhost:8080`.

---

## Endpoints da API

### 1. Criar uma Conta
- **POST /accounts**
- **Corpo da Requisição (JSON)**:
  ```json
  {
      "holderName": "João",
      "accountNumber": "123456",
      "balance": 1000.00
  }
  ```

### 2. Listar Todas as Contas
- **GET /accounts**
- **Resposta**:
  ```json
  [
      {
          "id": 1,
          "holderName": "João",
          "accountNumber": "123456",
          "balance": 1000.00
      }
  ]
  ```

### 3. Buscar Conta pelo ID
- **GET /accounts/{id}**
- **Resposta**:
  ```json
  {
      "id": 1,
      "holderName": "João",
      "accountNumber": "123456",
      "balance": 1000.00
  }
  ```

### 4. Atualizar uma Conta
- **PUT /accounts/{id}**
- **Corpo da Requisição (JSON)**:
  ```json
  {
      "holderName": "Maria",
      "accountNumber": "654321",
      "balance": 2000.00
  }
  ```

### 5. Excluir uma Conta
- **DELETE /accounts/{id}**
- Resposta: **204 No Content**.

---

## Banco de Dados H2

A aplicação usa o H2 Database em memória para desenvolvimento. Para acessar o console do H2:

1. Acesse: `http://localhost:8080/h2-console`.
2. Use as seguintes credenciais:
   - **JDBC URL**: `jdbc:h2:mem:qbank`
   - **Username**: `sa`
   - **Password**: (deixe vazio).

---

## Contribuição

Sinta-se à vontade para contribuir com melhorias, relatando problemas ou enviando pull requests.

---

## Licença

Este projeto está sob a licença MIT.
