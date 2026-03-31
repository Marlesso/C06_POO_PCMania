package promocao;
import promocao.componentes.HardwareBasico;
import promocao.componentes.MemoriaUSB;
import promocao.componentes.SistemaOperacional;

public class Computador {
    private String marca;
    private float preco;

    private HardwareBasico[] hardwares;
    private int qtdHardware;

    private SistemaOperacional sistemop;
    private MemoriaUSB musb;

    public Computador(String marca, float preco, SistemaOperacional so) {
        this.marca = marca;
        this.preco = preco;
        sistemop = so;
        hardwares = new HardwareBasico[10];
        qtdHardware = 0;
    }

    public float getPreco() {
        return preco;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: "+this.marca);
        System.out.println("Preço: R$"+this.preco);

        for(int i=0; i<qtdHardware; i++){
            System.out.println(hardwares[i].getNome()+" ("+hardwares[i].getCapacidade()+" "+hardwares[i].getUnidade()+")");
        }

        System.out.println("Sistema Operacional "+sistemop.getNome()+"("+sistemop.getTipo()+" bits)");

        if(musb != null){
            System.out.println("Acompanha "+musb.getNome()+" de "+musb.getCapacidade()+musb.getUnidade());
        } else {
            System.out.println("Sem acompanhamento");
        }
        System.out.println();
    }

    public void addMemoriaUSB(MemoriaUSB musb) {    // Descobrir o que era para isso fazer
        this.musb = musb;
    }

    public void addHardwareBasico(HardwareBasico hb){
        if(qtdHardware < hardwares.length){
            hardwares[qtdHardware] = hb;
            qtdHardware++;
        }
    }
}