import java.util.ArrayList;
import java.util.PriorityQueue;

public class Application {
    public static void main(String[] args) {
        int[] data = {3, 2, 5, 4, 1, 8, 7, 6, 39, 29};
        Heap heap = new Heap();
        for(int i = 0; i < data.length; i++) {
            heap.insert(data[i]);
        }

        ArrayList<Integer> test =  heap.getNodeList();

        int maxSize = test.size()-1;
        for(int i = 0; i < maxSize; i++) {
            System.out.println(heap.peek());
            heap.delete();
        }
    }
}
