import java.util.ArrayList;

public class Nave {

    private String nome;
    private int capacidadeCarga;
    private ArrayList<Tripulante> tripulacao;

    public Nave(String nome, int capacidadeCarga) {
        this.nome = nome;
        this.capacidadeCarga = capacidadeCarga;
        this.tripulacao = new ArrayList<>();
    }

    public void viajar(int anosLuz) {
        System.out.println("A nave" + nome + " está viajando " + anosLuz + " anos luz");   
    }
    public void adicionarTripulante(Tripulante t) {
        tripulacao.add(t);
    }

    public void exibirStatus() {
        System.out.println("Nome da nave: " + nome);
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
        System.out.println("Quantidade de tripulantes: " + tripulacao.size());
        System.out.println("Tripulantes a bordo:");
    for (Tripulante t : tripulacao) {
        System.out.println("- " + t.getNome()+ " cargo: " +t.getCargo()); 
}
}
}