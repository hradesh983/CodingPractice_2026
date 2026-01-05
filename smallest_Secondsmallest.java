
class smallest_Secondsmallest{
    public static int small_secondsmall(int arr[]){
        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]<small){
                //second_small=small;
                small=arr[i];
            }
            else if(arr[i]<second_small && arr[i]!=small){
                second_small=arr[i];
            }
        }
        return second_small;

    }
    public static void main(String[] args) {
        int []arr={1,2,4,7,7,5};
        System.out.println(small_secondsmall(arr));

    }
}

