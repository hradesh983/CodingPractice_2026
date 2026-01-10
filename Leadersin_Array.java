import java.util.*;
class Leadersin_Array{
    public static ArrayList<Integer> leaders(int arr[],int n){
        ArrayList<Integer> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                ans.add(arr[i]);
                max=Math.max(max,arr[i]);

            }
            
        }
        Collections.reverse(ans);
        return ans;

    }
    public static void main(String[]args){
        int arr[]={10,22,12,3,0,6};
        ArrayList<Integer> ans=leaders(arr,6);
        for(int num:ans){
            System.out.println(num+" ");

        }
    }
}