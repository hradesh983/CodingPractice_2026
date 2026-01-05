import java.util.*;
class union_1{
    public  static List<Integer> union_f1(int arr1[],int arr2[]){
        TreeMap<Integer,Integer> freq=new TreeMap<>();
        for(int i=0;i<arr1.length;i++){
            freq.put(arr1[i],freq.getOrDefault(arr1[i], 0)+1);
        }
        for(int i=0;i<arr2.length;i++){
            freq.put(arr2[i],freq.getOrDefault(arr2[i], 0)+1);
        }

        List<Integer> Union=new ArrayList<>();
        for(int key:freq.keySet()){
            Union.add(key);
        }
        return Union;
    }
    public static void main(String[]args){
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[]={2,3,4,4,5,11,12};

        List<Integer> Union=union_f1(arr1,arr2);
        for(int un:Union){
            System.out.println(un);
        }
        
    }
}