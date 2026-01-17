import java.util.*;

class Sum {

    public static List<List<Integer>> sum(int arr[], int n) {
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        Collections.sort(temp);
                        ans.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {
        int arr[] = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = sum(arr, arr.length);

        for (List<Integer> list : result) {
            System.out.print("{ ");
            for (int value : list) {
                System.out.print(value + " ");
            }
            System.out.println("}");
        }
    }
}
