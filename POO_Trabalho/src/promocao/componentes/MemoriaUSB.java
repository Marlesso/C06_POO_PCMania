package promocao.componentes;

public class MemoriaUSB {
    private String nome;
    private int capacidade;
    private String unidade;

    public MemoriaUSB(String nome, int capacidade, String unidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public String getUnidade() {
        return unidade;
    }
}
