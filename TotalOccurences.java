public class TotalOccurences {
    public static void main(String[] args) {

        int array[]={5,10,10,10,10,20,20};
        int k=10;
        int first=firstOccurence(array,k);
        if (first!=-1){
            int last=lastOccurence(array,k);
            System.out.println(last-first+1);
        }
        else System.out.println("zero occurences");
    }
    static int firstOccurence(int array[],int k){
        int low=0,high= array.length-1;
        while(high>=low){
            int mid=(low+high)/2;
            if (array[mid]>k) high=mid-1;
            else if (array[mid]<k) low=mid+1;
            else{
                if (mid==0|| array[mid]!=array[mid-1]) return mid;
                else high=mid-1;
            }
        }
        return -1;
    }
    static int lastOccurence(int array[],int k){
        int low=0,high= array.length-1;
        while(high>=low){
            int mid=(low+high)/2;
            if (array[mid]>k) high=mid-1;
            else if (array[mid]<k) low=mid+1;
            else{
                if (mid==high|| array[mid]!=array[mid+1]) return mid;
                else low=mid+1;
            }
        }
        return -1;
    }

}
