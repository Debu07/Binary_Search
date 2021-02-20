public class PeakElementOptimal {
    public static void main(String[] args) {
        int array[]={5,15,20,30,40,10};
        int peak=findPeak(array);
        System.out.println(peak);
    }
    static int findPeak(int array[]){
        int low=0,high= array.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (mid==0 || (array[mid]>array[mid+1])&&
                    (mid== array.length-2|| array[mid]>array[mid-1]))
                return array[mid];
            if (mid>0 && array[mid-1]>array[mid]) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
}
