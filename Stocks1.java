class Stocks1{
    public static  int Calprofit(int prices[],int n){
        int minprice=Integer.MAX_VALUE;
        int profit=0;
        for(int price:prices){
            if(price<minprice){
                minprice=price;
            }else{
                profit=Math.max(profit,price-minprice);
            }
        }
        return profit;
    }
    public static void main (String[]args){
        int prices[]={7,1,5,3,6,4};
        int ans=Calprofit(prices,6);
        System.out.println(ans);
    }
}