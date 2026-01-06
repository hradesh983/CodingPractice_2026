import java.util.*;
class TwoSum1{
    public static int []checksum(int arr[],int n,int target){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            int required=target-arr[i];
            if(map.containsKey(required)){
                return new int[]{map.get(required),i};
            }
            else{
                map.put(arr[i],i);
            }
        }
        return new int[] {-1,-1};



    }
    public static void main(String[]args){
        int arr[]={2,6,5,8,11};
        int ans[]=checksum(arr,5,8);
        System.out.println(ans[0]+" "+ans[1]);
        
    }
}