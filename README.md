# API de Gerenciamento de Investimentos

Esta é uma API Spring Boot para gerenciar investimentos. Ela permite cadastrar, listar, atualizar e excluir investimentos, além de realizar validações para garantir a integridade dos dados.

## Funcionalidades

- **Cadastro de Investimentos:**
    - Nome do investimento (ex.: Fundo X, Ação Y).
    - Tipo de investimento (ex.: Ação, Fundo, Título).
    - Valor investido.
    - Data do investimento.

- **Listagem de Investimentos:**
    - Retorna todos os investimentos cadastrados.

- **Atualização de Investimentos:**
    - Permite editar os dados de um investimento específico.

- **Exclusão de Investimentos:**
    - Remove um investimento do sistema.

- **Validações:**
    - O valor investido deve ser maior que 0.
    - A data do investimento não pode estar no futuro.

## Tecnologias Utilizadas

- **Spring Boot:** Framework para desenvolvimento de aplicações Java.
- **PostgreSql:** Banco de dados relacional para armazenamento dos dados.
- **Swagger:** Documentação e teste da API.
- **Docker:** 

## Pré-requisitos

- Java 17.
- MySQL instalado e configurado.
- Maven para gerenciamento de dependências.
- Docker instalado e configurado.

## Configuração

1. **Clone o repositório:**

   ```bash
   https://github.com/JhonataKornaker/apiInvestimentos.git
   cd apiInvestimentos
   
## Executando a Aplicação

1. **Compile e execute o projeto**

    Na raiz do projeto, execute o Run ApiInvestimentoApplication.


2. **Banco de dados Docker**

    Execute o comando abaixo para rodar o banco de dados.
    
    ```bash
   docker-compose up
   
3. **Acesse o Swagger para testar a API**

    ```bash
   http://localhost:8080/swagger-ui.html