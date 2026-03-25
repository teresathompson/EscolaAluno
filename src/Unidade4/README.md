# Aula 4 - CRUD com JDBC e Heranca

Este diretorio apresenta um conjunto de exemplos de operacoes CRUD (Create, Read, Update, Delete) usando Java e JDBC, com foco em reutilizacao de codigo por heranca.

## Objetivo da Aula

Demonstrar como:

1. Centralizar comportamentos comuns de acesso a banco em uma classe base.
2. Especializar classes filhas para cada operacao CRUD.
3. Reduzir duplicacao de codigo com metodos reutilizaveis e interfaces funcionais.
4. Tratar excecoes SQL de forma padrao, com possibilidade de personalizacao.

## Estrutura de Classes

As classes da pasta Aula4 sao:

1. CRUDBase.java
2. DatabaseConnection.java
3. InsertExample.java
4. QueryExample.java
5. UpdateExample.java
6. DeleteExample.java

## Visao Geral da Arquitetura

O desenho segue o padrao Template Method simplificado:

1. A classe base CRUDBase concentra a infraestrutura de conexao, execucao de SQL e tratamento padrao de erros.
2. As classes filhas (InsertExample, QueryExample, UpdateExample e DeleteExample) fornecem apenas a logica especifica da operacao.
3. Cada classe filha chama um metodo run(), acionado pelo main().

Isso melhora manutencao, legibilidade e reaproveitamento.

## Detalhamento por Classe

### 1) CRUDBase

Classe abstrata responsavel por comportamentos comuns.

Responsabilidades principais:

1. Definir constantes de cor para mensagens no terminal (GREEN, RED, RESET).
2. Fornecer getConnection(), delegando para DatabaseConnection.
3. Executar comandos de escrita com executeUpdate(String sql, PreparedStatementSetter setter).
4. Executar consultas com executeQuery(String sql, ResultSetHandler handler).
5. Tratar erros SQL em handleSQLException(...).
6. Exibir mensagem padrao de conclusao em printOperationFinished(...).

Interfaces funcionais internas:

1. PreparedStatementSetter: recebe um PreparedStatement para configurar parametros antes do executeUpdate().
2. ResultSetHandler: recebe um ResultSet para processar as linhas retornadas por uma consulta.

Beneficio:

As classes filhas nao precisam abrir conexao, criar statement, nem repetir blocos try/catch/finally.

### 2) DatabaseConnection

Classe utilitaria para conexao JDBC.

Responsabilidades:

1. Armazenar URL, usuario e senha do banco.
2. Expor getConnection() para retornar uma conexao via DriverManager.

Observacoes:

1. Atualmente os dados de conexao estao fixos no codigo.
2. Em projetos reais, o ideal e mover essas informacoes para variaveis de ambiente ou arquivo de configuracao.

### 3) InsertExample

Classe concreta de insercao (Create), herda de CRUDBase.

Fluxo:

1. Monta SQL de INSERT em Clientes.
2. Configura parametros (ID, Nome, Email, DataNascimento) via lambda em executeUpdate(...).
3. Exibe quantidade de linhas afetadas.
4. Exibe mensagem final de operacao.

Diferencial:

Sobrescreve handleSQLException(...) para tratar erro de chave duplicada (codigo 1062), exibindo mensagem amigavel para ID ja existente.

### 4) QueryExample

Classe concreta de leitura (Read), herda de CRUDBase.

Fluxo:

1. Executa SELECT \* FROM Clientes via executeQuery(...).
2. Itera no ResultSet.
3. Extrai colunas ID, Nome, Email e DataNascimento.
4. Imprime os dados de cada registro formatados no console.

Ponto importante:

Toda a infraestrutura de conexao e fechamento de recursos permanece encapsulada na classe base.

### 5) UpdateExample

Classe concreta de atualizacao (Update), herda de CRUDBase.

Fluxo:

1. Monta SQL de UPDATE para alterar Email por ID.
2. Configura os parametros via lambda em executeUpdate(...).
3. Verifica rowsAffected para informar sucesso ou ausencia de registro.
4. Exibe total de linhas afetadas e mensagem de conclusao.

### 6) DeleteExample

Classe concreta de remocao (Delete), herda de CRUDBase.

Fluxo:

1. Monta SQL DELETE por ID.
2. Configura parametro de ID via lambda em executeUpdate(...).
3. Verifica rowsAffected para informar se removeu ou nao encontrou registro.
4. Exibe total de linhas afetadas e mensagem final.

## Fluxo de Execucao de Cada Exemplo

Todas as classes concretas seguem um mesmo padrao:

1. main() instancia a propria classe.
2. run() define SQL e comportamento especifico.
3. CRUDBase executa o SQL com try-with-resources.
4. O resultado (sucesso, erro, linhas afetadas) e mostrado no console.

## Conceitos Tecnicos Trabalhados

1. JDBC (Connection, PreparedStatement, Statement, ResultSet).
2. SQL basico de CRUD.
3. Heranca e reutilizacao de codigo.
4. Classes abstratas e especializacao por subclasses.
5. Interfaces funcionais e expressoes lambda.
6. Tratamento de excecoes com customizacao por override.

## Como Executar

1. Garanta um banco MySQL ativo com schema compativel (exemplo: tabela Clientes).
2. Ajuste URL/usuario/senha em DatabaseConnection.java.
3. Execute individualmente cada classe com metodo main:
   - InsertExample
   - QueryExample
   - UpdateExample
   - DeleteExample

## Sugestoes de Evolucao

1. Extrair configuracoes de banco para arquivo externo.
2. Criar uma camada DAO para separar regra de negocio de acesso a dados.
3. Adicionar logs estruturados em vez de apenas System.out.
4. Implementar testes de integracao para validar as operacoes.
5. Evoluir o executeQuery para aceitar PreparedStatement com parametros.
