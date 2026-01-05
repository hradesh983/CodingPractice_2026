class check_sortedarray{
    public static boolean check_sorted(int []arr){
    int n=arr.length;
    for(int i=1;i<n;i++){
        if(arr[i]<arr[i-1]){
            return false;
        }
    }
    return true;
}


public static void main(String[]args){
    int arr[]={1,0,8,9};
    System.out.println(check_sorted(arr));
}
}
