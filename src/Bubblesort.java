public class Bubblesort {
    public static void main(String[] args) {
        int[] vetor = {5, 9, 3, 1, 6, 25, 8};

        System.out.print("Vetor Desordenado: ");
        Utils.imprimirVetor(vetor);

        /*
            Devido ao grande número de comparações e trocas que são realizadas, esse
            metodo é considerado um dos piores em termos de desempenho, principalmente
            em vetores grandes.
        */

        bubble(vetor);

        System.out.print("Vetor ordenado com o método Bubblesort: ");
        Utils.imprimirVetor(vetor);
    }

    public static void bubble(int[] vetor) {
        int num;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    num = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = num;
                }
            }
        }
    }
}