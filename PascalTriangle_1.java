import java.util.*;
class PascalTriangle_1{
    public static List Pascal1(int n){
        List<Integer> list=new ArrayList<>();
        int ans=1;
        list.add(1);
        for(int i=1;i<n;i++){
            ans=(ans)*(n-i);
            ans=(ans)/(i);
            list.add(ans);
        }
        return list;
        
    }
    
    public static void main(String[]args){
        List<Integer> ans=Pascal1(5);
        System.out.print(ans);

    }
}