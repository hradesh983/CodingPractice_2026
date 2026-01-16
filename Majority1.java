import java.util.*;
class Majority1{
    public static int Majority1(int arr[],int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>n/3){
                return entry.getKey();
            }

        }
        return -1;

    }
    public static void main(String[]args){
        int arr[]={3,2,2,1,1,1,3,2,2};
        int ans=Majority1(arr,arr.length);
        System.out.println(ans);

    }
}