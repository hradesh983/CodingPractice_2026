import java.util.*;
class MajorityElement0{
    public static List Majority0(int arr[],int n){
        List<Integer> ans=new ArrayList<>();

        int count1=0;
        int count2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(count1==0 && el1!=arr[i]){
                count1=1;
                el1=arr[i];

            }
            else if(count2==0 && el2!=arr[i]){
                count2=1;
                el2=arr[i];
            }
            else if(el1==arr[i]){
                count1++;

            }else if(el2==arr[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
            
        }
        int min=n/3+1;
        int count3=0;
        int count4=0;
        for(int i=0;i<n;i++){
            if(arr[i]==el1){
                count3++;
                
            }
            if(arr[i]==el2){
                count4++;
            }
        }

            if(count3>=min){
                ans.add(el1);
            }
            if(count4>=min && el1!=el2){
                ans.add(el2);
            }
        
        return ans;
    }
    public static void main(String[]args){
        int arr[]={1,1,1,2,2,2};
        List<Integer> result=Majority0(arr,arr.length);
        for(int num:result){
            System.out.print(num+" ");
        }

    }
}