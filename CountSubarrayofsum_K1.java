import java.util.*;
class CountSubarrayofsum_K1{
    public static int Count_subarray(int arr[],int k){
       Map<Integer,Integer> map=new HashMap<>();
       int count=0;
       int prefixsum=0;
       map.put(0,1);
       
       for(int i=0;i<arr.length;i++){
        prefixsum+=arr[i];
        int remove=prefixsum-k;
        if(map.containsKey(remove)){
            count+=map.get(remove);
        }
        map.put(prefixsum,map.getOrDefault(prefixsum,0 )+1);
       }
        
        return count;
    }

    public static void main(String[]args){
        int arr[]={3,1,2,4};
        int k=6;
        int ans=Count_subarray(arr,k);
        System.out.println(ans);


    }
}