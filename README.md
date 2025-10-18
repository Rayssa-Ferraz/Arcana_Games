<br />
 
<div align="center">
<img src="https://i.imgur.com/w8tTOuT.png" alt="Logo Spring Boot" />
</div>
 
<br />
 
<div align="center">
<img src="https://img.shields.io/github/languages/top/Rayssa-Ferraz/Arcana_Games?style=flat-square" />
<img src="https://img.shields.io/github/repo-size/Rayssa-Ferraz/Arcana_Games?style=flat-square" />
<img src="https://img.shields.io/github/languages/count/Rayssa-Ferraz/Arcana_Games?style=flat-square" />
<img src="https://img.shields.io/github/last-commit/Rayssa-Ferraz/Arcana_Games?style=flat-square" />
<img src="https://img.shields.io/github/issues/Rayssa-Ferraz/Arcana_Games?style=flat-square" />
<img src="https://img.shields.io/github/issues-pr/Rayssa-Ferraz/Arcana_Games?style=flat-square" />
<img src="https://img.shields.io/badge/status-em%20desenvolvimento-orange" alt="Status: Em Desenvolvimento">
</div>
 
<br />

# 🎮 Arcana Games - E-commerce de Jogos (Backend)

## 📌 1. Descrição do Projeto

A **API Arcana Games** é uma aplicação backend que permite gerenciar **produtos** e **categorias**, simulando o funcionamento de uma loja virtual de games.

O projeto foi desenvolvido com fins educacionais para praticar conceitos de **API RESTful**, **Spring Boot**, **JPA/Hibernate** e integração com o **MySQL**.

Entre os principais recursos que uma loja de games oferece, destacam-se:
* Cadastro, listagem, atualização e exclusão de **produtos**.
* Cadastro e gerenciamento de **categorias**.
* Associação entre **produto** e **categoria** (relacionamento **One-to-Many**).
* Consultas filtradas por **nome** e **preço** (maior/menor).

## 🚀 2. Sobre esta API

A API **Arcana Games** foi desenvolvida utilizando Java e o **framework Spring Boot**, seguindo os princípios da Arquitetura **MVC** e **REST**.

Ela oferece endpoints para o gerenciamento dos recursos **Categoria** e **Produto**, com regras de validação e boas práticas de desenvolvimento.

### 2.1. Principais Funcionalidades da API:

* **CRUD completo** de **Categorias** e **Produtos**.
* Consultas filtradas por **nome** e **preço**.
* Associação de produtos a categorias (**One-to-Many**).
* Validação de dados com **Jakarta Validation**.

---

## 🏗️ 3. Diagrama de Classes (UML)

O Diagrama de Classes (UML) representa a estrutura das entidades do sistema no nível de código Java.

<div align="center">
    <img src="https://ik.imagekit.io/f9incgeso/diagrama_classe_arcanagames.png?updatedAt=1760744372954" alt="Diagrama de Classes (UML) Arcana Games" width="500"/>
</div>

**Relacionamento:** A `Categoria` **classifica** (`1`) muitos `Produtos` (`many`).

## 🧱 4. Diagrama Entidade-Relacionamento (DER)

O DER (Diagrama Entidade-Relacionamento) mostra como as entidades se traduzem em tabelas no banco de dados **MySQL** (`db_arcanagames`) e o vínculo entre elas.

<div align="center">
    <img src="https://ik.imagekit.io/f9incgeso/DER_db_arcanagames.png?updatedAt=1760743509334" alt="Diagrama Entidade-Relacionamento (DER) Arcana Games" width="200"/>
</div>

**Tabelas:**
* `tb_categorias`: Contém a lista de categorias.
* `tb_produtos`: Contém os dados dos produtos. A coluna `categoria_id` é a chave estrangeira (FK) que liga o produto à sua categoria.

---

## ⚙️ 5. Tecnologias Utilizadas

| Item | Descrição |
| :--- | :--- |
| **Servidor** | Tomcat (Integrado no Spring Boot) |
| **Linguagem** | Java 17 |
| **Framework** | Spring Boot 3 |
| **ORM** | JPA + Hibernate |
| **Banco de Dados** | MySQL (Esquema `db_arcanagames`) |
| **Validação** | Jakarta Validation |
| **Testes** | Insomnia |

## 📦 6. Requisitos

Para executar o projeto localmente, você precisará:
* Java JDK 17+
* Banco de dados **MySQL**
* Spring Tool Suite (STS)
* Insomnia

## 🛠️ 7. Como Executar o Projeto no STS

### 7.1. Importando o Projeto

1. Clone o repositório do Projeto **Arcana Games** dentro da pasta do **Workspace** do STS:

```bash
git clone https://github.com/Rayssa-Ferraz/Arcana_Games.git
```

2. Abra o STS e selecione a pasta do **Workspace** onde você clonou o repositório.
3. No menu superior do STS, clique na opção: **File 🡲 Import...**
4. Na janela **Import**, selecione: **General 🡲 Existing Projects into Workspace** e clique em **Next**.
5. No item **Select root directory**, clique em **Browse...** e selecione a pasta do Workspace onde você clonou o projeto.
6. O STS reconhecerá o projeto automaticamente.
7. Marque o projeto **Arcana Games** e clique em **Finish**.

### 7.2. Executando o Projeto

1. Na Guia **Boot Dashboard**, localize o seu projeto.
2. Selecione o projeto e clique no botão **Start or Restart**.
3. Acompanhe o console para verificar se a inicialização ocorreu sem erros.
4. Confirme que o banco de dados `db_arcanagames` e as tabelas (`tb_categorias`, `tb_produtos`) foram criados.
5. Utilize o **Insomnia** para testar os endpoints.

---

## 🧪 8. Como Executar os Testes (Insomnia)

A coleção de requisições está disponível para download e contém o CRUD completo e as consultas extras.

**Arquivo da Coleção:**
[Insomnia_2025-10-17.yaml](https://github.com/Rayssa-Ferraz/Arcana_Games/blob/main/teste_isomnia_arcanagames/Insomnia_2025-10-17.yaml)

**Estrutura dos Testes:**

| Pasta | Requisição | Tipo de Teste |
| :--- | :--- | :--- |
| 📂 **Categoria** | `POST`, `GET`, `PUT`, `DELETE` | CRUD Básico |
| 🕹️ **Produto** | `POST`, `PUT`, `DELETE` | CRUD com Relacionamento |
| 🕹️ **Produto** | `GET /produtos/preco_maior/...` | Consulta por Preço (Maior que X, ASC) |
| 🕹️ **Produto** | `GET /produtos/preco_menor/...` | Consulta por Preço (Menor que X, DESC) |
| 🕹️ **Produto** | `GET /produtos/nome/...` | Busca por Nome (Ignora Case) |

## 🌟 9. Contato

Desenvolvido por **[Rayssa](https://github.com/Rayssa-Ferraz)**. Para dúvidas, sugestões ou colaborações, entre em contato via GitHub ou abra uma issue!