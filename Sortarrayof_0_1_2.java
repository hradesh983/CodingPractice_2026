class Sortarrayof_0_1_2{
    public  void sort(int nums[],int n){
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;

            }
        }
    }
    public static void main(String[]args){
        Sortarrayof_0_1_2 obj=new Sortarrayof_0_1_2();
        int nums[]={0,2,0,1,2};
        obj.sort(nums,5);
        for(int num:nums){
            System.out.println(num+" ");
        }


        
    }

}