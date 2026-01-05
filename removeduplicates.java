class removeduplicates{
    public  int duplicates(int []arr){
        int i=0;
        
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
            
        }
        return i+1;
    }
    public static void main(String[]args){
        int arr[]={0,0,1,1,2};
        removeduplicates remove=new removeduplicates();
        
        int k=remove.duplicates(arr);
        for(int x=0; x<k ;x++){
            System.out.println(arr[x]+" ");
        }
        
        
    }
}