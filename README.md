# Auth API - Sistema de Autenticação Robusto

Este projeto é uma API Rest desenvolvida em Java com Spring Boot, focada em segurança e gerenciamento de usuários.

## 🚀 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3**
- **Spring Security 6** (Autenticação e Autorização)
- **JWT (JSON Web Token)** (Tokens Stateless)
- **MySQL** (Banco de Dados)
- **Flyway/Hibernate** (Gerenciamento de Banco)
- **Swagger/OpenAPI** (Documentação)

## ⚙️ Como Rodar

1. Clone o repositório.
2. Configure o banco de dados MySQL no arquivo `src/main/resources/application.properties`.
3. Execute o projeto.
4. Acesse a documentação em: `http://localhost:8080/swagger-ui.html`

## 🛡️ Endpoints Principais

- `POST /auth/login`: Realiza login e retorna o Token JWT.
- `POST /auth/register`: Cria um novo usuário (Roles: ADMIN ou USER).
- `POST /product`: Rota protegida (Requer Token + Role ADMIN).

## 👨‍💻 Autor

Desenvolvido como projeto prático de portfólio focando em boas práticas de segurança.