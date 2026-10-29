# Onboarding com Java Collections

Atividade de Programação Orientada a Objetos para praticar coleções e diferentes formas de percorrer dados em Java.

## Funcionalidades

- Calcular o total e a média de horas usando `List` e `for-each`.
- Buscar valores e consultar suas posições na lista.
- Remover valores abaixo de um limite usando `removeIf`.
- Cadastrar permissões sem repetição usando `Set`.
- Relacionar matrículas e etapas do onboarding usando `Map`.
- Identificar utilizadores duplicados por e-mail com `equals` e `hashCode`.
- Receber dados pelo terminal com `Scanner`.

## Organização

As classes ficam no package `onboarding`:

- `Main`: executa o programa e recebe os dados do usuário.
- `ControleHoras`: gerencia a lista de horas.
- `ControlePermissoes`: gerencia as permissões.
- `ControleAlunos`: relaciona matrículas às etapas.
- `Utilizador`: representa um utilizador e define igualdade por e-mail.

## Como executar

1. Abra o projeto no IntelliJ IDEA.
2. Acesse o package `onboarding` dentro de `src`.
3. Execute o método `main` da classe principal.
4. Digite os valores solicitados no terminal.

## Tecnologias

- Java
- Java Collections Framework
- IntelliJ IDEA

As permissões AWS são exemplos usados na atividade. O programa não realiza conexão com serviços da Amazon.
