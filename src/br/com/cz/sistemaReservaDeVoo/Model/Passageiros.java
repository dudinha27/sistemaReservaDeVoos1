package br.com.cz.sistemaReservaDeVoo.Model;
import java.util.ArrayList;
import java.util.List;

public class Passageiros {
    public String nome;
    public int id;
    public String email;
    public List<Reservas> reservas;

    public Passageiros(String nome, int id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
        this.reservas = new ArrayList<>();
    }

    public void exibirInfo() {
        System.out.println("\nNome: " + nome);
        System.out.println("ID: " + id);
        System.out.println("Email: " + email);
        System.out.println("\nReservas: ");
        for (Reservas reserva : reservas) {
            reserva.exibirInfo();
        }
    }

    public String getNome() {
        return nome;
    }

    public boolean fazerReserva(Voo voo, int numAssentos, String dataReserva) {
        if (numAssentos > 0) {
            Reservas reserva = new Reservas(this, voo, dataReserva, numAssentos);
            reservas.add(reserva);
            return true;
        } else {
            System.out.println("Numero invalido de assentos para reservar!");
            return false;
        }
    }

    public void cancelarReserva(Reservas reserva) {
        reservas.remove(reserva);

    }
}
