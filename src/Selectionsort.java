public class Selectionsort {
    public static void main(String[] args) {
        int[] vetor = {5, 9, 3, 1, 6, 25, 8, 4, 15};

        System.out.print("Vetor Desordenado: ");
        Utils.imprimirVetor(vetor);

        selection(vetor);

        System.out.print("Vetor ordenado com o método Selectionsort: ");
        Utils.imprimirVetor(vetor);
    }

    public static void selection(int[] vetor) {
        int i, j, posMin, valorMin;
        boolean troca;
        for (i = 0; i < vetor.length - 1; i++) {
            troca = false;
            posMin = i;
            valorMin = vetor[i];

            for (j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < valorMin) {
                    posMin = j;
                    valorMin = vetor[j];
                    troca = true;
                }
            }

            if (troca) {
                vetor[posMin] = vetor[i];
                vetor[i] = valorMin;
            }
        }
    }
}
