import java.util.ArrayList;
import java.util.Vector;

public class CollectionTester {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        ArrayList<Integer> arrayList = CollectionTester.genRandomArrayList(319999999);
        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }

    public static ArrayList<Integer> genRandomArrayList(int length){
        ArrayList<Integer> arrayList = new ArrayList<>(length);

        for(int i = 0; i < length; i++){
            arrayList.add((int) (Math.random()*9));
        }

        return arrayList;
    }

    public static int[] genRandomArray(int length){
        int[] arr = new int[length];
        for(int i = 0; i < length; i++){
            arr[i] = (int) (Math.random()*9);
        }

        return arr;
    }

    public static Vector<Integer> genRandomVector(int length){
        Vector<Integer> vector = new Vector<>(length);
        for(int i = 0; i < length; i++){
            vector.add((int) (Math.random()*9));
        }

        return vector;
    }
}
