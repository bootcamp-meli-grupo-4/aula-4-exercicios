package luiz.aula3.ex2;

import java.util.Comparator;

// https://gist.github.com/JeffersonCN/4f469893c18759040e21b8929816eabf
public class HeapSortImple<T> implements Sorter<T>{

    private int tam;

    private T[] vetor;

    public void heapsort(T[] array, Comparator<T> c) {
        vetor = array;
        tam = vetor.length - 1;

        // Chama a função para construir um Max-Heap
        constroiHeap(c);

        // Assim que a Max-Heap foi criada, o processo de ordenação pode começar.
        // Através desse loop que a troca do valor do topo com o valor da última posição da Heap é feita
        for (int i = tam; i > 0; i--) {
            troca(0, tam);      // Troca a posição
            tam -= 1;           // Diminui 'tam' para não alterar a posição do maior valor nas próximas iterações
            maxHeapifica(0, c);    // Como existe um valor menor no topo, é necessário heapificar novamente a árvore inteira
        }
    }

    // Função que constrói o Max-Heap
    private void constroiHeap(Comparator<T> c) {
        // Como o último nível da árvore não tem filhos, a construção se inicia no último elemento da penúltima.
        // Esse elemento se encontra bem no meio do vetor, ou seja, tam/2:
        int meio = (int) (tam/2);

        // Para cada elemento do penúltimo nível, chama o maxHeapifica, ou seja
        // encontra o maior elemento e coloca como pai
        for (int i = meio - 1; i >= 0; i--) {
            maxHeapifica(i, c);
        }
    }

    // Função de troca
    // É uma função simples de swap, para auxiliar na troca de posição dos valores
    private void troca(int i, int j) {
        T aux;

        aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }

    // Função maxHeapifica
    // Essa função é o core do algoritmo.
    // Ela faz a comparação entre os valores de um Heap e ao encontrar o maior, o coloca como pai da Heap.
    // Isso faz com que qualquer Heap se torne um Max-Heap.
    private void maxHeapifica(int pai, Comparator<T> c) {
        int maior = pai,            // O maior elemento é o pai, até que se prove o contrário.
                esquerda = 2 * pai + 1,     // Pega a posição do filho da esquerda
                direita = 2 * pai + 2;  // e a do filho da direita.

        // Se o filho da esquerda existe, ou seja, se ele está dentro do intervalo verificável do array E
        // Se este filho é maior que o pai (que no momento é o 'maior')
        if (esquerda <= tam && c.compare(vetor[esquerda], vetor[maior]) > 0)
            maior = esquerda;

        // Se o filho da direita existe, ou seja, se ele está dentro do intervalo verificável do array E
        // Se este filho é maior que o 'maior' (que no momento pode ser o 'pai' ou o 'esquerda')
        if (direita <= tam && c.compare(vetor[direita], vetor[maior]) > 0)
            maior = direita;

        // Se ao chegar até aqui o 'pai' deixou de ser o 'maior' valor
        if (maior != pai) {
            troca(pai, maior);      // Faz a troca de posições
            maxHeapifica(maior, c);    // Continua heapificando com o valor que foi trocado
        }
    }

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        heapsort(arr, c);
    }
}
