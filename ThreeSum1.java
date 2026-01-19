import java.util.*;

class ThreeSum1 {

    public List<List<Integer>> threeSum(int[] arr, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    left++;
                    right--;

                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {-1, 0, 1, 2, -1, -4};
        ThreeSum1 obj = new ThreeSum1();

        List<List<Integer>> res = obj.threeSum(arr, arr.length);

        for (List<Integer> triplet : res) {
            for (int num : triplet) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
