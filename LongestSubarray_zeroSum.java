 import java.util.*;
 class LongestSubarray_zeroSum{
    public static int maxlength(int num[],int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        for(int i=0;i<n;i++){
            sum+=num[i];
            // we get the max length
            if(sum==0){
            maxlen=i+1;
            }
            else if(map.containsKey(sum)){
                maxlen=Math.max(maxlen,i-map.get(sum));
                

            }
            else{
                map.put(sum,i);
            }
        
        }
        return maxlen;

        

    }
    public static void main(String[]args){
        int num[]={6, -2, 2, -8, 1, 7, 4, -10};
        int ans=maxlength(num,8);
        System.out.println(ans);




    }
 }