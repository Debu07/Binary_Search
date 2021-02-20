public class PeakElementNaive {
    public static void main(String[] args) {
        int array[]={1,15,15,5,90,33,12};
        int peakElement=findPeak(array);
        System.out.println(peakElement);
    }
    static int findPeak(int array[]){
        int n= array.length;
        if (n==1) return array[0];
        if (array[0]>array[1]) return array[0];
        if (array[n-1]>array[n-2]) return array[n-1];
        for (int i=1;i<n-1;i++){
            if (array[i]>array[i-1] && array[i]>array[i+1]) return array[i];
        }
        return -1;
    }
}
