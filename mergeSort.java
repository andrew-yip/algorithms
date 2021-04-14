import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {

        int[] A = { 6, 5, 4, 3, 2, 1 };
        int[] temp = new int[A.length];
        System.out.println(Arrays.toString(A));
        mergesort(A, temp, 0, A.length - 1);
        System.out.println(Arrays.toString(A));

    }

    public static void mergesort(int[] A, int[] temp, int left, int right) {
        if (left >= right) {
            return;
        }

        int mid = (right + left) / 2;
        mergesort(A, temp, left, mid);
        mergesort(A, temp, mid + 1, right);
        merge(A, temp, left, mid, right);
    }

    public static void merge(int[] A, int[] temp, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int index = left;

        while (i <= mid && j <= right) {
            if (A[i] < A[j]) {
                temp[index] = A[i];
                i++;
            } else {
                temp[index] = A[j];
                j++;
            }
            index++;
        }

        while (i <= mid) {
            temp[index] = A[i];
            i++;
            index++;
        }

        while (j <= right) {
            temp[index] = A[j];
            j++;
            index++;
        }

        for (int k = left; k <= right; k++) {
            A[k] = temp[k];
        }

    }
}
