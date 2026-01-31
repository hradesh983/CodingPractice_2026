class RoatateBy1_1{
    public static void rotate(int arr[],int n){
        int temp=arr[0];
        
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        

    }
    public static void main(String[]args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        rotate(arr,n);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}