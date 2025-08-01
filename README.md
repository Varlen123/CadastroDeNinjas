# 🥢 Cadastro de Ninjas

Um projeto simples em Java com Spring Boot para cadastrar, listar, editar e deletar ninjas e missões! Ideal para treinar conceitos de API REST e CRUD.

---

## 📦 Tecnologias Utilizadas

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Maven

---

## 🚀 Como rodar o projeto localmente

1. Clone o repositório:

   ```bash
   git clone https://github.com/Varlen123/CadastroDeNinjas.git
   ```

2. Acesse o diretório:

   ```bash
   cd CadastroDeNinjas
   ```

3. Execute o projeto (via sua IDE ou terminal):

   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse a aplicação:

   * H2 Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
   * API Base URL: `http://localhost:8080`

---

## 📘 Documentação da API

### 🌟 Ninjas

#### `GET /ninjas`

Retorna a lista de todos os ninjas cadastrados.

#### `GET /ninjas/{id}`

Retorna os dados de um ninja específico.

#### `POST /ninjas`

Cria um novo ninja.

#### `PUT /ninjas/{id}`

Atualiza os dados de um ninja existente.

#### `DELETE /ninjas/{id}`

Remove um ninja pelo ID.

Exemplos de corpo da requisição, respostas e códigos de status estão detalhados acima (🔹 seções anteriores).

---

### 💪 Missões

#### `GET /missoes`

Retorna todas as missões cadastradas.

**Resposta:**

```json
[
  {
    "id": 1,
    "descricao": "Proteger a vila",
    "rank": "B",
    "concluida": false
  }
]
```

#### `GET /missoes/{id}`

Retorna uma missão pelo ID.

**Resposta:**

```json
{
  "id": 1,
  "descricao": "Proteger a vila",
  "rank": "B",
  "concluida": false
}
```

#### `POST /missoes`

Cria uma nova missão.

**Corpo:**

```json
{
  "descricao": "Capturar espião",
  "rank": "A",
  "concluida": false
}
```

#### `PUT /missoes/{id}`

Atualiza uma missão existente.

**Corpo:**

```json
{
  "descricao": "Proteger a Hokage",
  "rank": "S",
  "concluida": true
}
```

#### `DELETE /missoes/{id}`

Remove uma missão pelo ID.

**Resposta de sucesso:**

* Código: `204 No Content`

---
