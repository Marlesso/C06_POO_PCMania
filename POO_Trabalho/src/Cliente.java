import promocao.Computador;

public class Cliente {
    private String nome;
    private String cpf;

    private Computador[] compras;
    private int qtdComputadores;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;

        compras = new Computador[10];
        qtdComputadores = 0;
    }

    public void mostraInfo(){
        System.out.println("\nCliente: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println();
    }

    public Computador[] getCompras() {
        return compras;
    }

    public int getQtdComputadores() {
        return qtdComputadores;
    }

    public void addComputador(Computador c) {
        if(qtdComputadores < compras.length) {
            compras[qtdComputadores] = c;
            qtdComputadores++;
        }
    }

    public float calculaTotalCompra() {
        float total=0;
        for(int i=0; i < qtdComputadores; i++){
            total += compras[i].getPreco();
        }
        return total;
    }
}
