import java.util.*;

class LongestConsequence{
    public static int longest(int nums[],int n){
        int longest=1;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(nums[i]);
        }

        for(int it:st){
            if(!st.contains(it-1)){
                int count=1;
                int x=it;

                while(st.contains(x+1)){
                    x=x+1;
                    count=count+1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;


    }
    public static void main(String[]args){
        int nums[]={102,4,100,1,101,3,2,1,1};
        int ans=longest(nums,9);
        System.out.println(ans);
    }
}