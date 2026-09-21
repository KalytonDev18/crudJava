# CRUD de Produtos em Java

Aplicação de console desenvolvida em **Java** para gerenciamento de produtos, implementando as operações básicas de um CRUD:

* **Create** — Criar produtos
* **Read** — Buscar e listar produtos
* **Update** — Atualizar produtos
* **Delete** — Excluir produtos

O projeto foi desenvolvido com foco na prática de **Java, Programação Orientada a Objetos, Collections e organização de responsabilidades entre classes**.

## Tecnologias

* Java
* Programação Orientada a Objetos (POO)
* `ArrayList`
* `List`
* `Scanner`

## Funcionalidades

O sistema possui um menu interativo no terminal:

```text
--------------------------------
MENU:
1 - Criar produto
2 - Buscar pelo ID
3 - Listar Produtos
4 - Atualizar Produto
5 - Deletar Produto
```

### Criar produto

Permite cadastrar um novo produto informando:

* Nome
* Preço

O sistema gera automaticamente um ID incremental.

### Buscar produto

Permite localizar um produto através do seu ID.

### Listar produtos

Exibe todos os produtos cadastrados, mostrando:

* ID
* Nome
* Preço

### Atualizar produto

Permite alterar o nome e o preço de um produto existente através do ID.

### Deletar produto

Remove um produto cadastrado através do seu ID.

## Estrutura do projeto

```text
src/
├── Main.java
├── Produto.java
└── ProdutoService.java
```

### `Main.java`

Responsável pela interação com o usuário e pelo funcionamento do menu principal.

Utiliza `Scanner` para receber os dados digitados no terminal e chama os métodos da classe `ProdutoService`.

### `Produto.java`

Representa a entidade **Produto**.

Possui os seguintes atributos:

```java
private int id;
private String nome;
private double preco;
```

A classe utiliza **encapsulamento**, disponibilizando getters e setters para acesso e alteração dos atributos.

### `ProdutoService.java`

Responsável pelas regras e operações relacionadas aos produtos.

Principais métodos:

```java
criarProduto()
buscarPorId()
listarProdutos()
atualizarProduto()
deletarProduto()
```

Os produtos são armazenados temporariamente em uma:

```java
List<Produto>
```

implementada através de um `ArrayList`.

## Conceitos praticados

Este projeto foi desenvolvido para praticar conceitos fundamentais de Java:

* Classes e objetos
* Encapsulamento
* Construtores
* Getters e setters
* Métodos
* Estruturas condicionais
* Estruturas de repetição
* `List` e `ArrayList`
* Entrada de dados com `Scanner`
* Separação de responsabilidades
* Operações CRUD

## Como executar

### 1. Clone o repositório

```bash
git clone URL_DO_REPOSITORIO
```

### 2. Entre na pasta

```bash
cd nome-do-projeto
```

### 3. Compile os arquivos

```bash
javac *.java
```

### 4. Execute

```bash
java Main
```

## Exemplo de utilização

```text
MENU:
1 - Criar produto
2 - Buscar pelo ID
3 - Listar Produtos
4 - Atualizar Produto
5 - Deletar Produto

OPÇÃO: 1

Digite o nome do produto: Teclado
Digite o preco do produto: 150

Produto criado com sucesso!
ID: 1
```

Depois, o produto pode ser localizado:

```text
OPÇÃO: 2

Digite o ID do produto: 1

Produto encontrado: Teclado - R$150.0
```

## Persistência

Atualmente, os dados são armazenados **somente em memória** através de um `ArrayList`.

Isso significa que os produtos cadastrados são perdidos quando a aplicação é encerrada.

### Próximas evoluções

Possíveis melhorias para transformar o projeto em uma aplicação mais próxima de um sistema real:

* [ ] Adicionar validação dos dados de entrada
* [ ] Tratar produtos inexistentes nas buscas
* [ ] Melhorar tratamento de exceções
* [ ] Separar melhor as responsabilidades da aplicação
* [ ] Implementar interface ou API REST
* [ ] Utilizar Spring Boot
* [ ] Adicionar banco de dados
* [ ] Implementar JPA/Hibernate
* [ ] Criar testes unitários
* [ ] Criar documentação da API

## Objetivo

Este projeto faz parte do meu processo de aprendizado em **Java e desenvolvimento de software**, colocando em prática conceitos fundamentais antes da evolução para aplicações com **Spring Boot, APIs REST e banco de dados**.
