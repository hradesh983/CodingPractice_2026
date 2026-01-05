import java.util.*;

class union_3 {

    public static List<Integer> union_f3(int arr1[], int arr2[], int m, int n) {

        List<Integer> Union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < m && j < n) {

            if (arr1[i] < arr2[j]) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
            } 
            else if (arr2[j] < arr1[i]) {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr2[j]) {
                    Union.add(arr2[j]);
                }
                j++;
            } 
            else {
                if (Union.isEmpty() || Union.get(Union.size() - 1) != arr1[i]) {
                    Union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < m) {
            if (Union.get(Union.size() - 1) != arr1[i]) {
                Union.add(arr1[i]);
            }
            i++;
        }

        while (j < n) {
            if (Union.get(Union.size() - 1) != arr2[j]) {
                Union.add(arr2[j]);
            }
            j++;
        }

        return Union;
    }

    public static void main(String[] args) {

        int arr1[] = {1,2,3,4,5,6,7,8,9,10,11};
        int arr2[] = {2,3,4,4,5,11,12};

        List<Integer> Union = union_f3(arr1, arr2, 11, 7);

        for (int num : Union) {
            System.out.println(num);
        }
    }
}
