import java.util.ArrayList;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int k=30;
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        array.add(60);
        array.add(70);
        int start=0;
        int end= array.size();
        int index=binarySearch(array,start,end,k);
        if (index==-1) System.out.println("Element not found");
        else System.out.printf("Element found at index %d",index);
    }
    static int binarySearch(ArrayList<Integer> array,int start,int end,int k){
        while(start<=end){
            int mid=(start+end)/2;
            if (array.get(mid).equals(k)) return mid;
            else if (array.get(mid)>k) return binarySearch(array,start,mid-1,k);
            else return binarySearch(array,mid+1,end,k);
        }
        return -1;
    }
}
