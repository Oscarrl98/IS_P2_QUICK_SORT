package gt.edu.umg.ingenieria.sistemas.ingenieria_software.parcial2.quick_sort.service;

public class QuickSortService {

    private String input[];
    private int length;

    public QuickSortService(){
    }


    /**
     * Metodo principal que llama recursivamente a quiqsort para el ordemainiento del array
     * @param names
     */
    public void sort(String[] names) {
        if (names == null || names.length == 0) {
            return;
        }
        this.input = names;
        length = names.length;
        quickSort(0, length - 1);
    }

    /**
     * Metodo que simula y selecciona un elemento como pivote y divide la matriz dada alrededor del pivote elegido.
     * @param low
     * @param high
     */
    private void quickSort(int low, int high) {
        int i = low;
        int j = high;

        // pivote es el medio
        String pivot = input[low + (high - low) / 2];

        // Divide entre dos arrays
        while (i <= j) {
            while (input[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }
            while (input[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(low, j);
        }

        if (i < high) {
            quickSort(i, high);
        }
    }

    private void swap(int i, int j) {
        String temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    /**
     * IMprime el array
     * @param arr
     */
    public void printArray(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
