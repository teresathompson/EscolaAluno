# EscolaAluno - Exercicios de Java por Unidades

Este repositorio reune exercicios e exemplos de Java organizados por unidades e aulas.
O foco principal e praticar fundamentos da linguagem, orientacao a objetos, excecoes,
colecoes e acesso a dados com JDBC.

## Objetivo Geral

Consolidar conceitos de Java por meio de exemplos pequenos e progressivos, incluindo:

1. Classes, objetos, heranca e polimorfismo.
2. Encapsulamento e validacao de dados.
3. Tratamento de excecoes (padrao e personalizadas).
4. Leitura e gravacao de arquivos.
5. Colecoes (ArrayList, HashMap, HashSet, Queue).
6. Operacoes CRUD com JDBC.

## Estrutura do Projeto

Principais diretorios:

1. src - codigo-fonte Java organizado por unidades e aulas.
2. bin - classes compiladas e algumas estruturas espelhadas.
3. arquivos de apoio na raiz (por exemplo: arquivo.txt, config.txt, dados.txt, estoque.txt).

### Visao geral de src

1. Classes introdutorias de dominio academico:
   - Aluno.java
   - AlunoGraduacao.java
   - AlunoPosGraduacao.java
   - Avaliacao.java
   - Escola.java
   - App.java
2. Unidade 3:
   - ExemploTextoUnidade3Aula2
   - ExercicioAula1Unidade3
   - ExercicioUnidade3Aula3
   - Unidade3Aula4
   - Unidade3Aula5
   - VamosExercitarUnidade3Aula2
   - VamosExercitarUnidade3Aula3
3. Unidade 4:
   - Aula1
   - Aula2
   - Aula3
   - Aula4

## Destaques por Modulo

### Nucleo Academico (raiz de src)

Contem classes de modelagem de aluno, variacoes por nivel e exemplos iniciais de execucao.

### Unidade3Aula4

Topicos: leitura de arquivo e tratamento de excecoes.

Inclui:

1. LeituraArquivo - leitura de arquivo texto com Scanner.
2. TratamentoExcecao - exemplo de tratamento de ArithmeticException.
3. ExcecaoIdade - excecao personalizada e validacao de faixa de idade.
4. ExcecaoLogin - autenticacao simples com excecao personalizada.
5. GerenciadoConfiguracao - leitura de configuracao com tratamento de arquivo inexistente.

README detalhado do modulo:

1. [src/Unidade3Aula4/README.md](src/Unidade3Aula4/README.md)

### Unidade3Aula5

Topicos: modelagem orientada a objetos em cenarios praticos.

Inclui exemplos como:

1. Concessionaria (veiculos, carro e moto).
2. GerenciamentoCursos (curso e instrutor).

### Unidade4

Topicos: colecoes e persistencia.

1. Aula2: Array e ArrayList (gerenciamento, ordenacao e notas).
2. Aula3: HashMap, HashSet, Queue e operacoes com arquivo.
3. Aula4: CRUD com JDBC e reutilizacao por heranca.

README detalhado de Aula4:

1. [src/Unidade4/Aula4/README.md](src/Unidade4/Aula4/README.md)

## Como Compilar e Executar

Exemplo de compilacao geral (na raiz do projeto):

```powershell
javac -d bin src\**\*.java
```

Exemplo de execucao de uma classe com pacote:

```powershell
java -cp bin Unidade3Aula4.LeituraArquivo
```

Exemplo de execucao de CRUD (Unidade4/Aula4):

```powershell
java -cp bin Unidade4.Aula4.QueryExample
java -cp bin Unidade4.Aula4.InsertExample
java -cp bin Unidade4.Aula4.UpdateExample
java -cp bin Unidade4.Aula4.DeleteExample
```

## Requisitos

1. Java JDK instalado (recomendado JDK 17 ou superior).
2. Terminal com suporte a execucao Java.
3. Para Aula4 (JDBC):
   - Banco MySQL acessivel.
   - Driver JDBC no classpath, quando necessario.
   - Credenciais configuradas em DatabaseConnection.java.

## Observacoes

1. O projeto tem carater educacional e exemplos independentes.
2. Nem todos os exemplos compartilham a mesma estrutura de entrada/saida.
3. Alguns modulos dependem de arquivos texto locais na raiz do projeto.

## Proximos Passos Sugeridos

1. Padronizar scripts de compilacao e execucao (por exemplo, via Maven ou Gradle).
2. Centralizar configuracoes externas (banco e arquivos) em propriedades.
3. Adicionar testes automatizados para os principais modulos.
