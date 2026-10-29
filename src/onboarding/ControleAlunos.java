package onboarding;

import java.util.HashMap;
import java.util.Map;

public class ControleAlunos {
    private Map<String, String> alunos = new HashMap<>();

    public void cadastrar(String matricula, String etapa) {
        alunos.put(matricula, etapa);
    }

    public void mostrarAlunos() {
        alunos.forEach((matricula, etapa) -> {
            System.out.println(
                    "Matricula: " + matricula + " - Etapa: " + etapa
            );
        });
    }
}
