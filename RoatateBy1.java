class RoatateBy1{
    public static int[] rotate(int arr[],int n){
        int temp[]=new int[n];
        
        for(int i=1;i<n;i++){
            temp[i-1]=arr[i];
        }
        temp[n-1]=arr[0];
        return temp;

    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int ans[]=rotate(arr,n);
        for(int num:ans){
            System.out.print(num+" ");
        }
    }
}