# 📝 Aplicativo de Gestão de Convidados

Aplicativo Java para gestão de convidados, desenvolvido com **Spring Boot**, **Thymeleaf** e **MySQL**. Integra **Spring Security**, **Spring Web** e **Spring Boot DevTools** para facilitar o desenvolvimento e a segurança da aplicação.

---

## ⚡ Funcionalidades

- Cadastro de convidados  
- Edição e atualização de informações  
- Organização de convidados de forma prática e intuitiva  
- Sistema de autenticação e autorização com Spring Security  

---

## 💻 Tecnologias Utilizadas

- **Java 17+**  
- **Spring Boot**  
- **Thymeleaf** (templates HTML)  
- **MySQL** (banco de dados relacional)  
- **Spring Security** (autenticação e autorização)  
- **Spring Web** (para construção de rotas e APIs)  
- **Spring Boot DevTools** (para hot reload e facilidade no desenvolvimento)

---

## 🛠️ Instalação

1. Clone o repositório:

```bash
git clone https://github.com/seuusuario/gestao-convidados.git
```
### 2. Configure o banco de dados MySQL:

Crie um banco de dados chamado gestao_convidados

Atualize o application.properties com suas credenciais

```
spring.datasource.url=jdbc:mysql://localhost:3306/gestao_convidados
spring.datasource.username=root
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### 3. Rode a aplicação:
mvn spring-boot:run

### 4. Acesse em http://localhost:8080

## 📂 Estrutura do Projeto

```text
src/
├─ main/
│  ├─ java/
│  │  └─ com.david.gestao
│  │     ├─ controller/
│  │     ├─ model/
│  │     ├─ repository/
│  │     └─ service/
│  └─ resources/
│     ├─ templates/   # Thymeleaf
│     └─ application.properties
```

## 🎬 Demonstração
![Login](https://github.com/davidOliveira1995/gestao-festa/blob/main/src/main/resources/images/screen-login.png)

![Logout](https://github.com/davidOliveira1995/gestao-festa/blob/main/src/main/resources/images/screen-logout.png)

![Lista Convidados](https://github.com/davidOliveira1995/gestao-festa/blob/main/src/main/resources/images/screen-one.png)

![Lista Convidados](https://github.com/davidOliveira1995/gestao-festa/blob/main/src/main/resources/images/screen-two.png)

## 📫 Contato

Desenvolvido por David de Oliveira

Linkedin: [David O.Silva](https://www.linkedin.com/in/david-oliveiraos/)
