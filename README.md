# Auth API - Sistema de Autenticação e Notificações

API REST robusta desenvolvida em Java com Spring Boot. Focada em segurança (JWT), controle de acesso (RBAC) e integração com serviços de e-mail.

## 🚀 Funcionalidades Principais

- **Autenticação Stateless:** Login via Tokens JWT (JSON Web Token).
- **Controle de Acesso:** Permissões diferenciadas para `ADMIN` e `USER`.
- **Notificações Automáticas:** Envio de e-mail de boas-vindas via Gmail SMTP após cadastro.
- **Segurança de Dados:** Criptografia de senhas com BCrypt.
- **Documentação:** Swagger UI interativo.

## 🛠️ Tecnologias Utilizadas

- **Java 17** & **Spring Boot 3**
- **Spring Security 6**
- **Spring Data JPA** & **MySQL**
- **JavaMailSender** (Integração SMTP)
- **Flyway** (Migrações de Banco de Dados)
- **Lombok** (Produtividade)

## 📋 Pré-requisitos

- **Java 17** ou superior instalado.
- **Maven** para gerenciamento de dependências.
- **MySQL** configurado e em execução.
- Conta Gmail com autenticação de dois fatores ativada (para geração de senha de app).

## ⚙️ Configuração Local

1. **Clone o repositório:**
   ```bash
   git clone <url-do-repositorio>
   cd auth-api
   ```

2. **Configure o banco de dados MySQL:**
   Edite o arquivo `src/main/resources/application.properties` e adicione suas configurações:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/auth_db
   spring.datasource.username=seu-usuario
   spring.datasource.password=sua-senha
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Configuração de E-mail:**
   Para testar o envio de e-mails, adicione suas credenciais no `application.properties`:
   ```properties
   spring.mail.host=smtp.gmail.com
   spring.mail.port=587
   spring.mail.username=seu-email@gmail.com
   spring.mail.password=sua-senha-de-app-google
   spring.mail.properties.mail.smtp.auth=true
   spring.mail.properties.mail.smtp.starttls.enable=true
   ```

   > **Nota:** Use uma senha de app do Google se a autenticação de dois fatores estiver ativada.

4. **Execute o projeto:**
   ```bash
   ./mvnw spring-boot:run
   ```

5. **Acesse a documentação:**
   - Swagger UI: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## 🧪 Testes

Para executar os testes:
```bash
./mvnw test
```

## 🛡️ Endpoints Principais

- `POST /auth/login`: Realiza login e retorna o Token JWT.
- `POST /auth/register`: Cria um novo usuário (Roles: ADMIN ou USER).
- `POST /product`: Rota protegida (Requer Token + Role ADMIN).

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/br/com/auth/auth_api/
│   │   ├── controllers/          # Controladores REST
│   │   ├── infra/                # Configurações de infraestrutura
│   │   │   ├── security/         # Configurações de segurança
│   │   │   └── springdoc/        # Configuração do Swagger
│   │   ├── model/                # Modelos de dados
│   │   ├── repositories/         # Repositórios JPA
│   │   └── services/             # Serviços de negócio
│   └── resources/
│       ├── application.properties # Configurações da aplicação
│       ├── static/               # Recursos estáticos
│       └── templates/            # Templates (se aplicável)
└── test/                         # Testes unitários
```

## 🤝 Contribuição

Contribuições são bem-vindas! Siga estes passos:

1. Fork o projeto.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`).
4. Push para a branch (`git push origin feature/nova-feature`).
5. Abra um Pull Request.


## 👨‍💻 Autor

João Vitor Lucini

Desenvolvido como projeto prático de portfólio focando em boas práticas de segurança.