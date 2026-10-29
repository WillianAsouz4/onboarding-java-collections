package onboarding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ControleHoras {
    private List<Integer>  horas = new ArrayList<>(
            Arrays.asList(8, 12, 20, 5, 15)
    );

    public int calcularTotal() {
        int total = 0;

        for (int hora : horas) {
            total += hora;
        }

        return total;
    }

    public double calcularMedia() {
        if (horas.isEmpty()) {
            return 0.0;
        }

        return (double) calcularTotal() / horas.size();
    }

    public boolean existe(int valor) {
        return horas.contains(valor);
    }

    public int buscarPossicao(int valor) {
        return horas.indexOf(valor);
    }

    public void removerMenoresQue(int limite) {
        horas.removeIf(hora -> hora < limite);
    }

    public void mostraHoras() {
        horas.forEach(hora -> {
            System.out.println("Horas registradas: " + hora);
        });
    }

}
