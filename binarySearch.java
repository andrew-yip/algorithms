public class binarySearch {
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 3;
        System.out.println("Index (recursive): " + binarySearchRecursive(A, 0, A.length - 1, target));
        System.out.println("Index (iterative): " + binarySearchIterative(A, 0, A.length - 1, target));
    }

    public static int binarySearchRecursive(int[] A, int left, int right, int target) {

        if (right >= left) {
            int mid = (left + right) / 2;

            if (A[mid] == target) {
                return mid;
            } else if (A[mid] > target) {
                return binarySearchRecursive(A, left, mid - 1, target);
            } else {
                return binarySearchRecursive(A, mid + 1, right, target);
            }
        }

        return -1;
    }

    public static int binarySearchIterative(int[] A, int left, int right, int target) {

        while (right >= left) {
            int mid = (left + right) / 2;
            if (A[mid] == target) {
                return mid;
            } else if (A[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;

    }

}
