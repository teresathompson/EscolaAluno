## Unidade3Aula4 - Leitura de Arquivo e Tratamento de Excecoes

Este diretorio contem exemplos praticos de manipulacao de arquivos e tratamento de excecoes em Java.
Os codigos foram organizados para mostrar:

1. Leitura de arquivos texto com Scanner.
2. Uso de try/catch/finally para tratar erros e liberar recursos.
3. Criacao e uso de excecoes personalizadas.
4. Separacao por pacotes tematicos (idade, login e configuracao).

## Estrutura da Pasta

### Arquivos e classes principais

1. arquivo.txt
2. LeituraArquivo.java
3. TratamentoExcecao.java

### Subpastas

1. ExcecaoIdade
2. ExcecaoLogin
3. GerenciadoConfiguracao

## Descricao das Classes

### LeituraArquivo.java

Pacote: Unidade3Aula4

Responsabilidade:

1. Ler o arquivo arquivo.txt linha por linha.
2. Exibir o conteudo no console.
3. Tratar erro caso o arquivo nao exista.
4. Fechar o Scanner no bloco finally.

Pontos tecnicos:

1. Usa File para representar o arquivo.
2. Usa Scanner com StandardCharsets.UTF_8 para evitar problemas de codificacao.
3. Lanca IOException no metodo main.

### TratamentoExcecao.java

Pacote: Unidade3Aula4

Responsabilidade:

1. Demonstrar tratamento de ArithmeticException.
2. Simular divisao por zero e capturar o erro.
3. Exibir mensagem amigavel no terminal.

Pontos tecnicos:

1. Define constantes ANSI para cor vermelha e reset.
2. Mostra o fluxo basico de try/catch.

### ExcecaoIdade/IdadeInvalidaException.java

Pacote: Unidade3Aula4.ExcecaoIdade

Responsabilidade:

1. Definir uma excecao personalizada para idade invalida.
2. Herdar de Exception para ser uma excecao checada.

### ExcecaoIdade/ValidaIdade.java

Pacote: Unidade3Aula4.ExcecaoIdade

Responsabilidade:

1. Validar se a idade esta no intervalo aceito.
2. Lancar IdadeInvalidaException quando idade < 0 ou idade > 120.

### ExcecaoIdade/TesteIdade.java

Pacote: Unidade3Aula4.ExcecaoIdade

Responsabilidade:

1. Executar um teste da validacao de idade.
2. Capturar e exibir a mensagem da excecao personalizada.

### ExcecaoLogin/LoginInvalidoException.java

Pacote: Unidade3Aula4.ExcecaoLogin

Responsabilidade:

1. Definir excecao personalizada para falhas de autenticacao.
2. Herdar de Exception para uso em validacoes de login.

### ExcecaoLogin/SistemaLogin.java

Pacote: Unidade3Aula4.ExcecaoLogin

Responsabilidade:

1. Simular autenticacao com usuario e senha.
2. Lancar LoginInvalidoException quando credenciais nao conferem.
3. Exibir mensagem de sucesso quando autenticacao e valida.

Regra atual de exemplo:

1. Usuario esperado: admin
2. Senha esperada: 1234

### ExcecaoLogin/TesteLogin.java

Pacote: Unidade3Aula4.ExcecaoLogin

Responsabilidade:

1. Testar o fluxo de login invalido.
2. Capturar a excecao e exibir a mensagem de erro.

### GerenciadoConfiguracao/GerenciadorConfiguracao.java

Pacote: Unidade3Aula4.GerenciadoConfiguracao

Responsabilidade:

1. Ler o arquivo config.txt.
2. Mostrar configuracoes no console quando o arquivo existe.
3. Tratar FileNotFoundException quando o arquivo nao e encontrado.
4. Garantir fechamento do Scanner no finally.

Pontos tecnicos:

1. Usa File e Scanner com UTF_8.
2. Exibe mensagem de liberacao de recurso ao final.

## Conceitos Trabalhados na Aula

1. Excecoes checadas e nao checadas.
2. Excecoes personalizadas com extends Exception.
3. Estrutura try/catch/finally.
4. Leitura de arquivo texto com Scanner.
5. Uso de pacotes para organizar responsabilidades.

## Como Executar

1. Compile os arquivos Java da pasta src.
2. Execute as classes com metodo main, por exemplo:
   - LeituraArquivo
   - TratamentoExcecao
   - ExcecaoIdade.TesteIdade
   - ExcecaoLogin.TesteLogin
   - GerenciadoConfiguracao.GerenciadorConfiguracao
3. Garanta que os arquivos arquivo.txt e config.txt estejam acessiveis no diretorio de execucao.

## Observacoes

1. Os exemplos sao didaticos e focam em aprendizagem de fundamentos.
2. Em sistemas reais, recomendam-se logs estruturados e camada de servico para validacoes.
3. Credenciais e regras de autenticacao devem ser externas ao codigo em aplicacoes de producao.
