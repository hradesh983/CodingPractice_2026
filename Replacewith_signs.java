import java.util.*;
class Replacewith_signs{
    public static void replace(int arr[],int n){
        List<Integer> pos=new ArrayList<>();
        List<Integer> neg=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                neg.add(arr[i]);

            }
            else{
                pos.add(arr[i]);
            }
        }
        int i=0,p=0,q=0;

        while(p<pos.size() && q<neg.size()){
            arr[i++]=pos.get(p++);
            arr[i++]=neg.get(q++);
        }
        while(p<pos.size()){
            arr[i++]=pos.get(p++);
        }
        while(q<neg.size()){
            arr[i++]=neg.get(q++);

        }
        

    }
    public static void main(String[]args){
        int arr[]={1,2,-4,-5,4,7};
        replace(arr,6);
        for(int num:arr){
            System.out.println(num+" ");
        }
    }
}