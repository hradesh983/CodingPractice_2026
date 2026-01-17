import java.util.*;
class Threesum {

    public static List<List<Integer>> sum(int arr[], int n) {
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hashset=new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third= -(arr[i]+arr[j]);
                if(hashset.contains(third)){
                    List<Integer> temp=Arrays.asList(arr[i],arr[j],third);
                    Collections.sort(temp);
                    ans.add(temp);

                }
                hashset.add(arr[j]);
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
