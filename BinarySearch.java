class BinarySearch{
    public static int search(int arr[],int n,int target){
        int left=0; int right=n-1;
        
        while(left<=right){
            int mid=(left+right)/2;
            
            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid]){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[]args){
        int arr[]={2,3,4,5,7,10,11,12};
        int n=arr.length;
        int ans=search(arr,n,10);
        System.out.println(ans);
    }
}