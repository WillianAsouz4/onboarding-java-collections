package onboarding;

import java.util.HashSet;
import java.util.Set;

public class ControlePremissoes {

    private Set<String> premissoes = new HashSet<>();

            public boolean adicionar(String premissao) {
                return premissoes.add(premissao);
            }

            public void mostrarPremissoes() {
                premissoes.forEach(premissao -> {
                    System.out.println("Premissao: " + premissao);
                });

            }

}
