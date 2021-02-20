public class InfiniteSearch {
    public static void main(String[] args) {
        int array[]={5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,
                85,90,100,110,150,170,200,250,300,500,750,1000,1500,1800,2000,2299,3456,4567,5678,6789,
        7890,8900,8907,56789,456789,3456789};
        int k=200;
        int index=upperBound(array,k);
        System.out.println(index);
    }
    static int upperBound(int array[],int key){
        if (array[0]==key) return 0;
        int i=1;
        while(array[i]<key){
            i=i*2;
        }
        if (array[i]==key) return i;
        else return binarySearch(array,key,i/2,i);
    }
    static int binarySearch(int array[],int key,int low,int high){
        while(low<=high){
            int mid=(low+high)/2;
            if (array[mid]==key) return mid;
            if (array[mid]>key) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
}
