package onboarding;

import java.util.Objects;

public class Utilizador {
    private String email;
    private String nome;

    public Utilizador(String email, String nome) {
        this.email = email;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;

      if (obj == null || getClass() != obj.getClass()) {
          return false;
      }

      Utilizador outro = (Utilizador) obj;
      return Objects.equals(email, outro.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

}

