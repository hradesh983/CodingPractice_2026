import java.util.*;
class union_2{
    public static List<Integer> union_f2(int arr1[],int arr2[]){
        Set<Integer> st=new TreeSet<>();
        for(int num:arr1){
            st.add(num);
        }
        for(int num:arr2){
            st.add(num);
        }

        return new ArrayList<>(st);

    }
    public static void main(String[]args){
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[]={2,3,4,4,5,11,12};
        List<Integer> Union=union_f2(arr1,arr2);
        for(int num:Union){
            System.out.println(num);
        }
    }
}