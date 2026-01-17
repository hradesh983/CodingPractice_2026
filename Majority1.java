import java.util.*;
class Majority1{
    public static List Majority1(int arr[],int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> result=new ArrayList<>();
        int min=n/3+1;
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        
            if(map.get(arr[i])==min){
                result.add(arr[i]);
            }
            if(result.size()==2){
                break;
            }
        }
        return result;
    

    }
    public static void main(String[]args){
        int arr[]={1,1,1,2,2,2};
        List<Integer> ans=Majority1(arr,arr.length);
        for(int num:ans){
            System.out.print(num+" ");
        }

    }
}