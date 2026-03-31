package promocao.componentes;

public class HardwareBasico {
    private String nome;
    private int capacidade;
    private String unidade;

    public HardwareBasico(String nome, int capacidade, String unidade) {
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
