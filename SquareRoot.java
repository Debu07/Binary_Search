public class SquareRoot {
    public static void main(String[] args) {
        int x=36;
        int squareRoot=calculateSquareRoot(x);
        System.out.println(squareRoot);
    }
    static int calculateSquareRoot(int x){
        int ans=-1;
        int low=0,high=x;
        while(high>=low){
            int mid=(low+high)/2;
            int midsq=mid*mid;
            if (midsq==x) return mid;
            else if (midsq>x) high=mid-1;
            else{
                low=mid+1;
                ans=mid;
            }
        }
        return ans;
    }
}
