class leftrotate_byone{

    public void rotate(int arr[]){
        int var=arr[0];
        for(int j=1;j<arr.length;j++){
            arr[j-1]=arr[j];
        }
        arr[arr.length-1]=var;
    }
    public static void  main(String[]args){
        leftrotate_byone rotates=new leftrotate_byone();
        int arr[]={1,2,3,4,5};
        rotates.rotate(arr);
        for(int arrs:arr){
            System.out.println(arrs+" ");
        }
    }
}