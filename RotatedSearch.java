public class RotatedSearch {
    public static void main(String[] args) {
        int array[]={10,20,30,40,50,8,9};
        int x=8;
        int index=searchRotation(array,x);
        System.out.println(index);
    }
    static int searchRotation(int array[],int x){
        int low=0,high= array.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (array[mid]==x) return mid;
            else if (array[low]<array[mid]){ // left half is sorted
                if (x>=array[low]&& x<array[mid]) high=mid-1; // if x lies in left half
                else low=mid+1;
            }
            else{  // right half is sorted
                if (x>array[mid]&& x<=array[high]) low=mid+1;
                else high=mid-1;
            }
        }
        return -1;
    }
}
