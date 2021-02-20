public class TotalOccurencesOne {
    public static void main(String[] args) {
        int array[]={0,0,1,1,1,1,1};
        int count=countOne(array);
        System.out.println(count);
    }
    static int countOne(int array[]){
        int low=0,high= array.length-1;
        while(high>=low){
            int mid = (low+high)/2;
            if (array[mid]==0) low=mid+1;
            else{
                if (mid==0||array[mid-1]==0) return (array.length-mid);
                else high=mid-1;
            }
        }
        return 0;
    }
}
