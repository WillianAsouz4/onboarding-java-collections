package onboarding;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class main{
    static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      ControleHoras controle = new ControleHoras();

      System.out.println("Total: " + controle.calcularTotal());
      System.out.println("Medias: " + controle.calcularMedia());

      System.out.println("Qual valor deseja Buscar? ");
      int valor = teclado.nextInt();

      if (controle.existe(valor)) {
          System.out.println(
                  "Valor encontrado mo indice " + controle.buscarPossicao(valor)
          );
      } else {
          System.out.println("Valor não encontrado.");
      }

      System.out.println("Remover Valor menores que:");
      int limite = teclado.nextInt();

      controle.removerMenoresQue(limite);
      controle.mostraHoras();

        System.out.println("Novo Total: " + controle.calcularTotal());
        System.out.println("Nova Medias: " + controle.calcularMedia());

        ControlePremissoes controlePremissoes = new ControlePremissoes();

        System.out.println(controlePremissoes.adicionar("S3_READ"));
        System.out.println(controlePremissoes.adicionar("LAMBDA_EXECUTE"));
        System.out.println(controlePremissoes.adicionar("S3_READ"));

      ControleAlunos controleAlunos = new ControleAlunos();

      controleAlunos.cadastrar("001", "Spring Boot");
      controleAlunos.cadastrar("002", "Deploy AWS");

      controleAlunos.mostrarAlunos();

      Set<Utilizador> utilizadores = new HashSet<>();

      System.out.println(
              utilizadores.add(new Utilizador("ana@email.com", "Ana"))
      );

      System.out.println(
              utilizadores.add(new Utilizador("ana@email.com", "Ana Silva"))
      );

      System.out.println("Quantidade: " + utilizadores.size());

    }

}
