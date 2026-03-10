# 📚 Sistema Simples de Cadastro de Aluno em Java

Este projeto é um exemplo simples desenvolvido em **Java** para demonstrar conceitos básicos de **Programação Orientada a Objetos (POO)**.

O programa simula o cadastro de um aluno e apresenta suas informações no console, incluindo validação de nota.

---

# 🎯 Objetivo do Projeto

Demonstrar os seguintes conceitos da linguagem Java:

- Criação de classes
- Instanciação de objetos
- Construtores
- Encapsulamento (getters e setters)
- Validação de dados
- Uso de métodos
- Saída de dados no console
- Uso de cores no terminal (ANSI)

---

# 📂 Estrutura do Projeto

### Arquivos

| Arquivo | Descrição |
|-------|-----------|
| **Aluno.java** | Define a classe `Aluno`, seus atributos e métodos |
| **Escola.java** | Contém o método `main`, responsável por executar o programa |

---

# 👨‍🎓 Classe `Aluno`

A classe `Aluno` representa um estudante e contém suas principais informações.

## Atributos

| Atributo | Tipo | Descrição |
|--------|------|-----------|
| `nome` | String | Nome do aluno |
| `matricula` | int | Número de matrícula |
| `nota` | double | Nota do aluno |

---

## Construtor

O construtor inicializa os atributos do aluno:

```java
public Aluno(String nome, int matricula, double nota)
