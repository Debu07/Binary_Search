import java.util.ArrayList;

public class BinarySearchIterative {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(40);
        array.add(50);
        array.add(60);
        array.add(70);
        int x=20;
        int index=binarySearch(array,x);
        if (index==-1){
            System.out.println("Element not found.");
        }
        else System.out.printf("element %d found at index %d",x,index);
    }
    static int binarySearch(ArrayList<Integer> array, int x){
        int low=0,high= array.size(),mid=0;
        while(low<=high){
            mid = (low+high)/2;
            if (array.get(mid).equals(x)) return mid;
            else if (array.get(mid)>x) high=mid-1;
            else if (array.get(mid)<x) low=mid+1;
        }
        return -1;
    }
}
