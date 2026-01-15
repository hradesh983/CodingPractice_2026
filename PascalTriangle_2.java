import java.util.*;
class PascalTriangle_2{
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
    public static List Triangle(int n){
        List<List<Integer>> triangle=new ArrayList<>();
        for(int i=1;i<n;i++){
            triangle.add(Pascal1(i));
            
        }
        return triangle;

    }
    public static void printPascal(int n) {
        for (int i = 1; i <= n; i++) {
            int ans = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(ans + " ");
                ans = ans * (i - j);
                ans = ans / j;
            }
            System.out.println();
        }
    }
    
    public static void main(String[]args){
        printPascal(5);

    }
}