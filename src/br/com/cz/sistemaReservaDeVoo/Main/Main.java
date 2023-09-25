package br.com.cz.sistemaReservaDeVoo.Main;
import br.com.cz.sistemaReservaDeVoo.Model.Aeroporto;
import br.com.cz.sistemaReservaDeVoo.Model.Passageiros;
import br.com.cz.sistemaReservaDeVoo.Model.Voo;

public class Main {
    public static void main(String[] args) {
        Aeroporto aeroporto = new Aeroporto("Aeroporto internacional de Congonhas", "Cidade de São Paulo");

        Voo voo1 = new Voo("V123", "São Paulo", "Londres", "2023-12-20  06:00", "2023-09-21  23:00", 200, 0);
        Voo voo2 = new Voo("V542", "São Paulo", "Rio de Janeiro", "2023-11-25  13:00", "2023-11-25  17:00", 170, 0);

        aeroporto.adicionarVoo(voo1);
        aeroporto.adicionarVoo(voo2);

        Passageiros passageiro1 = new Passageiros("Maria Clara Figueiredo", 1, "clara@gmail.com");
        Passageiros passageiro2 = new Passageiros("Maria Eduarda de Andrade", 2, "duda@gmail.com");

        passageiro1.fazerReserva(voo2, 1, "2023-11-25");
        passageiro2.fazerReserva(voo1, 3, "2023-12-20");

        aeroporto.exibirInfo();
        passageiro1.exibirInfo();
        passageiro2.exibirInfo();

    }
}
