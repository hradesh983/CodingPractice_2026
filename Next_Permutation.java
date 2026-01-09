class Next_Permutation {

    public static void nextpermutation(int arr[], int n) {

        int gola_index = -1;

        // Step 1: Find break point
        for (int i = n - 1; i > 0; i--) {
            if (arr[i - 1] < arr[i]) {
                gola_index = i - 1;
                break;
            }
        }

        // Step 2: If no next permutation exists
        if (gola_index == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find element just greater than arr[gola_index]
        for (int j = n - 1; j > gola_index; j--) {
            if (arr[j] > arr[gola_index]) {
                swap(arr, j, gola_index);
                break;
            }
        }

        // Step 4: Reverse right part
        reverse(arr, gola_index + 1, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2};
        nextpermutation(arr, arr.length);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
