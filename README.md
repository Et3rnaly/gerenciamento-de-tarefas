# 📋 Gerenciador de Tarefas (Java)

Projeto desenvolvido em Java puro com o objetivo de praticar lógica de programação, Programação Orientada a Objetos (POO) e organização de código, simulando um desafio real de nível vaga júnior.

O sistema funciona via console e permite ao usuário gerenciar tarefas de forma simples e eficiente.

## 🎯 Objetivo do Projeto

Este projeto foi criado para:

Reforçar conceitos fundamentais de Java

Aplicar POO na prática (classes, encapsulamento, enums)

Trabalhar com listas, filtros e datas

Desenvolver um pequeno sistema do zero, sem frameworks

Simular um projeto avaliável por recrutadores

Todo o código foi desenvolvido sem copiar soluções prontas, apenas com base no raciocínio e conhecimento adquirido.

## ⚙️ Funcionalidades

O sistema permite:

Criar uma nova tarefa

Listar todas as tarefas

Listar apenas tarefas pendentes

Marcar uma tarefa como concluída

Remover uma tarefa

Cada tarefa possui:

ID único (UUID)

Título

Descrição

Status (PENDENTE ou CONCLUÍDA)

Data e hora de criação

# 🧱 Estrutura do Projeto
```
src/
 ├── app/
 │    └── Main.java
 ├── model/
 │    ├── Tarefa.java
 │    └── StatusType.java
 └── service/
      ├── GerenciadorDeTarefas.java
      └── ConsoleService.java
```

## 📌 Responsabilidades

model: representação dos dados

service: regras de negócio e gerenciamento das tarefas

app: ponto de entrada da aplicação

## 🛠️ Tecnologias Utilizadas

Java SE

List / ArrayList

Enum

UUID

LocalDateTime

Stream API

Entrada de dados via Scanner

### ❌ Nenhum framework externo foi utilizado.

▶️ Como Executar o Projeto
Pré-requisitos

Java JDK 17 ou superior (ou compatível)

Terminal ou IDE (IntelliJ, Eclipse, VS Code)

Passos

Clone o repositório:

```
git clone https://github.com/Et3rnaly/gerenciamento-de-tarefas.git
```

Acesse a pasta do projeto:
```
cd gerenciamento-de-tarefas
```

Compile os arquivos:

```
javac app/Main.java
```

Execute a aplicação:
```
java app.Main
```
## 🧠 Conceitos Aplicados

Programação Orientada a Objetos

Encapsulamento

Enumeração para estados

Separação de responsabilidades

Manipulação de listas

Filtros com Stream

Boas práticas de organização de código

## 🚀 Possíveis Melhorias Futuras

Persistência das tarefas em arquivo (TXT ou JSON)

Identificação da tarefa por ID em vez de título

Validações mais avançadas

Interface gráfica ou API REST

Testes unitários

## 👨‍💻 Autor
```
Projeto desenvolvido por Samuel Veríssimo
GitHub: https://github.com/Et3rnaly
```
✅ Status do Projeto

✔ Concluído
📌 Aberto para melhorias e evolução contínua
