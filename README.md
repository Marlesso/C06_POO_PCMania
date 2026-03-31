# C06_POO_PCMania
Nome: Marcelo Rodrigues Rosa Paschoal
Curso: Engenharia de Software
Matrícula: 667

Utilizei o Chatgpt para relembrar como usar array de instâncias.
prompt: Olá chat, tenho um projeto de POO em java para fazer e quero relembrar como é feito o método de adição de uma instância para um array

Resposta do Chatgpt:
Boa pergunta — isso é fundamental em POO sem ArrayList e cai direto em prova 👇

🧠 Ideia principal

Array em Java tem tamanho fixo, então você precisa:

1. Criar o array
2. Ter um contador de posições usadas
3. Inserir manualmente na próxima posição livre
🧱 Estrutura padrão
´´´java
private Classe[] array;
private int qtd;
´´´
✅ Método de adição (padrão que você deve decorar)
public void addElemento(Classe obj) {
    if (qtd < array.length) {
        array[qtd] = obj;
        qtd++;
    } else {
        System.out.println("Array cheio!");
    }
}
📌 Exemplo com seu projeto (Computador no Cliente)
public void addComputador(Computador c) {
    if (qtdComputadores < compras.length) {
        compras[qtdComputadores] = c;
        qtdComputadores++;
    }
}
🔍 Passo a passo do que acontece

Suponha:

qtdComputadores = 0
Primeira inserção:
compras[0] = c;
qtdComputadores = 1;
Segunda:
compras[1] = c;
qtdComputadores = 2;

👉 Sempre insere na próxima posição livre

⚠️ Erros comuns (cuidado!)

❌ Esquecer o qtd++
❌ Ultrapassar o tamanho do array
❌ Usar índice fixo (array[0] sempre)
❌ Não inicializar o array no construtor

🧪 Versão mais segura (opcional)
public boolean addComputador(Computador c) {
    if (qtdComputadores < compras.length) {
        compras[qtdComputadores++] = c;
        return true;
    }
    return false;
}
🧠 Resumo pra prova

“Para adicionar em um array: uso um contador como índice e incremento após inserir, garantindo que não ultrapasse o tamanho do array.”

Se quiser, posso te passar também:

👉 como remover elemento do array (cai bastante)
👉 ou como buscar elemento dentro do array (muito comum também)

O que utilizei: Apenas apliquei essa lógica em meu código onde era necessário, optei pela que não possui retorno (void), mas achei interessante a de retorno boleano.
