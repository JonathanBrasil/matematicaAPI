# 📌 API REST - SISTEMA EDUCACIONAL ADAPTATIVO PARA O ENSINO DE MATEMÁTICA 

Este repositório contém uma API REST desenvolvida como parte de um estudo acadêmico, com o objetivo de ajudar no ensino e aprendizado de matemática na educação básica.  

---

## 📚 Índice

- [📌 Sobre o Projeto](#-sobre-o-projeto)
- [🚀 Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [⚙️ Como Executar o Projeto](#️-como-executar-o-projeto)
- [📬 Endpoints da API](#-endpoints-da-api)
- [🧪 Testes](#-testes)
- [📂 Estrutura de Pastas](#-estrutura-de-pastas)
- [📄 Licença](#-licença)

---

## 📌 Sobre o Projeto

Esta API foi desenvolvida, utilizando Java e Spring Boot, para fins acadêmicos e visa servir como apoio pedagógico voltada para auxiliar o ensino e a aprendizagem da matemática no ensino fundamental II.  
Seu código serve como artefato para análise e replicação de resultados descritos em um artigo científico em processo de avaliação.

---

## 🚀 Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- H2  
- Swagger
- Maven

---

## ⚙️ Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/JonathanBrasil/matematicaAPI.git
   cd <matematicaAPI>
   
2. Execute com o Maven:
   ```bash
   ./mvnw spring-boot:run
   
Através de navegador ou browser:
3. A API estará disponível localmente no endereço:
http://localhost:8080

4. A documentação dos endpoints estará em:
http://localhost:8080/swagger-ui.html

5. Através da documentação será possível testar o CRUD.

---

## 📬 Endpoints da API

### 🔹 `usuario-controller`

- `GET    /usuario`  
- `GET    /usuario/{id}`  
- `POST   /usuario`  
- `PUT    /usuario/{id}`  
- `DELETE /usuario/{id}`  

### 🔹 `unidade-controller`

- `GET    /unidade`  
- `GET    /unidade/{id}`  
- `PUT    /unidade/{id}`  
- `DELETE /unidade/{id}`  

### 🔹 `turma-controller`

- `GET    /turma`  
- `GET    /turma/{id}`  
- `POST   /turma`  
- `PUT    /turma/{id}`  
- `DELETE /turma/{id}`  

### 🔹 `resposta-controller`

- `GET    /resposta`  
- `GET    /resposta/{id}`  
- `POST   /resposta`  
- `POST   /resposta/responder`  
- `PUT    /resposta/{id}`  
- `DELETE /resposta/{id}`  

### 🔹 `questao-controller`

- `GET    /questao`  
- `GET    /questao/{id}`  
- `POST   /questao`  
- `PUT    /questao/{id}`  
- `DELETE /questao/{id}`  

### 🔹 `habilidade-controller`

- `GET    /habilidade`  
- `GET    /habilidade/{id}`  
- `POST   /habilidade`  
- `PUT    /habilidade/{id}`  
- `DELETE /habilidade/{id}`  

### 🔹 `desempenho-controller`

- `GET    /desempenho`  
- `GET    /desempenho/{id}`  
- `POST   /desempenho`  
- `PUT    /desempenho/{id}`  
- `DELETE /desempenho/{id}`

---

## 📂 Estrutura de Pastas

```bash
src/
 └── main/
     └── java/
         └── com/
             └── matematica/
                 ├── controller/     # Controladores REST da API
                 ├── model/          # Modelos (entidades) da aplicação
                 ├── repository/     # Interfaces de acesso ao banco de dados (JPA)
                 ├── service/        # Regras de negócio
                 └── MatematicaApiApplication.java  # Classe principal
```

---

## 📄 Licença

Este projeto está licenciado sob os termos da licença MIT.

Você pode usar, copiar, modificar e distribuir este código para fins **acadêmicos e educacionais**, desde que mantenha os devidos créditos aos autores.

> Para uso comercial ou redistribuição com alterações significativas, entrar em contato.
