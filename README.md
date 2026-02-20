# 🗡️ Sword Art Online API — Sistema de Jogadores e Guildas

<img src="./img/playerssao.png" alt="Players SAO">


API REST desenvolvida com Spring Boot para gerenciamento de jogadores e guildas, inspirada no universo de Sword Art Online.

O sistema permite operações completas de CRUD, relacionamento entre entidades e persistência em banco de dados PostgreSQL.

---

## 🚀 Tecnologias Utilizadas

- ☕ Java 17+
- 🌱 Spring Boot
- 🗄️ Spring Data JPA / Hibernate
- 🐘 PostgreSQL
- 📘 Swagger / OpenAPI (springdoc-openapi)
- 🧰 Maven
- 🔁 RESTful API

---

## 🧩 Funcionalidades

### 🏰 Guildas

- Criar guilda
- Listar todas as guildas
- Buscar guilda por ID
- Atualizar guilda
- Deletar guilda

---

### 🧝 Jogadores

- Criar jogador
- Listar todos os jogadores
- Buscar jogador por ID
- Atualizar jogador
- Deletar jogador

---

### 🔗 Relacionamento

- Um jogador pertence a uma guilda (**ManyToOne**)
- Enum de status do jogador:
    - ATIVO
    - INATIVO
    - BANIDO

---

## 📁 Estrutura do Projeto

src/main/java/br/com/guilda <br/>
├── controller <br/>
├── service <br/>
├── repository <br/> 
└── model <br/>

---

## 🗄️ Modelo de Dados

### Guilda

| Campo      | Tipo    |
|------------|---------|
| id         | Long    |
| nome       | String  |
| descricao  | String  |

---

### Jogador

| Campo      | Tipo    |
|------------|---------|
| id         | Long    |
| nome       | String  |
| nivel      | int     |
| status     | Enum    |
| guilda_id  | Long (FK) |

---

## ⚙️ Como Executar o Projeto

### ✔️ Pré-requisitos

- Java 17 ou superior
- Maven
- PostgreSQL instalado

---

### ✔️ 1. Criar Banco de Dados

```sql
CREATE DATABASE sao_db;
```

---

### ✔️ 2. Configurar application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/sao_api
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect

---

### ✔️ 3. Executar a Aplicação

mvn spring-boot:run

Ou execute a classe principal pela IDE.

---

### 📘 Documentação da API

Após iniciar a aplicação:
http://localhost:8080/swagger-ui.html

---

### 🧪 Endpoints da API

🏰 Guildas

GET    /guildas <br/>
GET    /guildas/{id} <br/>
POST   /guildas <br/>
PUT    /guildas/{id} <br/>
DELETE /guildas/{id} <br/>

🧝 Jogadores

GET    /players <br/>
GET    /players/{id} <br/>
POST   /players <br/>
PUT    /players/{id} <br/>
DELETE /players/{id} <br/>

---

### 📌 Exemplos de Requisições

Criar Guilda

{
"nome": "Knights of Blood",
"descricao": "Guilda de elite"
}

Criar Jogador
{
"nome": "Kirito",
"nivel": 80,
"status": "ATIVO",
"guilda": {
"id": 1
}
}

---
### 🎯 Objetivo do Projeto

Projeto desenvolvido para prática de:

- Desenvolvimento de APIs REST com Spring Boot

- Arquitetura em camadas (Controller, Service, Repository)

- Persistência com JPA/Hibernate

- Relacionamentos entre entidades

- Integração com PostgreSQL

- Documentação com Swagger/OpenAPI

### 🚀 Melhorias Futuras

- Validação de dados com Bean Validation

- Uso completo de DTOs

- Tratamento global de exceções

- Autenticação e autorização (JWT)

- Testes automatizados

- Docker + Docker Compose

- Deploy em nuvem

👨‍💻 Autor

Desenvolvido por Julio Cesar