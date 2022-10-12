package quickSort;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveAction;

public class forkJoin extends RecursiveAction {
    int inicio, fim;
    public static int array[];


    public forkJoin(int p, int r) {
        this.inicio = p;
        this.fim = r;
        compute();
    }

    public void inserirSort(int[] list, int start, int end) {
        for (int x = start + 1; x < end; x++) {
            int val = list[x];
            int j = x - 1;
            while (j >= 0 && val < list[j]) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = val;
        }
    }

    public static int particao(int p, int r) {
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (array[j] <= array[r]) {
                i++;
                int t = array[i];
                array[i] = array[j];
                array[j] = t;
            }
        }
        int t = array[i + 1];
        array[i + 1] = array[r];
        array[r] = t;
        return i + 1;
    }

    @Override
    protected final void compute() {
        int THRESHOLD = 4;
        if (inicio < fim) {
            if ((fim - inicio) < THRESHOLD) {
                this.inserirSort(array, inicio, fim + 1);
            } else {
                int part = particao(inicio, fim);
                forkJoin q1 = new forkJoin(0, part - 1);
                q1.fork();
                forkJoin q2 = new forkJoin(part + 1, fim);
                q2.fork();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        long t1 = System.currentTimeMillis();

        array = new int[]{1, 3, 65445, 0, 21, 2, 5432, 4, 342222};
        forkJoin q = new forkJoin(0, array.length - 1);
        System.out.println(Arrays.toString(array));

        long t2 = System.currentTimeMillis();
        System.out.println("Tempo do mergeSort: " + (t2 - t1));
    }

}
