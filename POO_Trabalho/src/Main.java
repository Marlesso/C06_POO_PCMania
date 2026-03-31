import promocao.componentes.HardwareBasico;
import promocao.componentes.SistemaOperacional;
import promocao.componentes.MemoriaUSB;
import promocao.Computador;
import helper.ProcessarPedido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Promoção 1:
        Computador promocao1 = new Computador("Apple", 667, new SistemaOperacional("macOS Sequoia", 64));
        promocao1.addHardwareBasico(new HardwareBasico("Pentium Core i3", 2200,"Mhz"));
        promocao1.addHardwareBasico(new HardwareBasico("Memória RAM", 8, "Gb"));
        promocao1.addHardwareBasico(new HardwareBasico("HD", 500, "Gb"));
        promocao1.addMemoriaUSB(new MemoriaUSB("Pen-Drive", 16, "Gb"));

        // Promoção 2:
        Computador promocao2 = new Computador("Sansung", 667+1234, new SistemaOperacional("Windows 8", 64));
        promocao2.addHardwareBasico(new HardwareBasico("Pentium Core i5", 3370,"Mhz"));
        promocao2.addHardwareBasico(new HardwareBasico("Memória RAM", 16, "Gb"));
        promocao2.addHardwareBasico(new HardwareBasico("HD", 1, "Tb"));
        promocao2.addMemoriaUSB(new MemoriaUSB("Pen-Drive", 32, "Gb"));

        // Promoção 3:
        Computador promocao3 = new Computador("Dell", 667+5678, new SistemaOperacional("Windows 10", 64));
        promocao3.addHardwareBasico(new HardwareBasico("Pentium Core i7", 4500,"Mhz"));
        promocao3.addHardwareBasico(new HardwareBasico("Memória RAM", 32, "Gb"));
        promocao3.addHardwareBasico(new HardwareBasico("HD", 2, "Tb"));
        promocao3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1, "Tb"));

        // "Login":
        String nome;
        String cpf;
        Scanner sc = new Scanner(System.in);
        System.out.println(">Digite o seu nome: ");
        nome = sc.nextLine();
        System.out.println(">Digite o seu CPF: ");
        cpf = sc.nextLine();

        Cliente c1 = new Cliente(nome, cpf);

        // Inicializando a compra:
        System.out.println("\nPromoção 1:");
        promocao1.mostraPCConfigs();
        System.out.println("Promoçao 2:");
        promocao2.mostraPCConfigs();
        System.out.println("Promoção 3:");
        promocao3.mostraPCConfigs();

        System.out.println("Estaria enteressado em alguma de nossas promoções?:");
        int op;
        do {
            System.out.println("\n1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Finalizar");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    c1.addComputador(promocao1);
                    break;
                case 2:
                    c1.addComputador(promocao2);
                    break;
                case 3:
                    c1.addComputador(promocao3);
                    break;
            }
        }while(op != 0);

        c1.mostraInfo();
        for(int i=0; i<c1.getQtdComputadores(); i++){
            c1.getCompras()[i].mostraPCConfigs();
        }
        System.out.println("\nTotal: R$"+c1.calculaTotalCompra());

        ProcessarPedido.enviarPedido(c1.getCompras(), c1.getQtdComputadores());

        sc.close();
    }
}