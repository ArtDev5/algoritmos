import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {25, 12, 23, 10, 5, 100};
        System.out.println("antes de ordenar: " + Arrays.toString(array));
        System.out.println("Após ordenar: " + Arrays.toString(order(array)));
    }

    public static int[] order(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int j = i;
            while(j > 0 && array[j] < array[j-1]) {
                int aux = array[j];
                array[j] = array[j-1];
                array[j-1] = aux;
                j--;
            }
        }
        return array;
    }
}
