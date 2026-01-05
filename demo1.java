import java.util.Arrays;
public class demo1{
    public static int largest1(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int largest2(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max);
            max=arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int []arr1={2,9,3,10};
        System.out.println(demo1.largest2(arr1));
    }
}



    
