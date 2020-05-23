package Heap;

import BinaryHeap.BinaryHeap;
import com.sun.source.tree.BinaryTree;

/**
 * @author Albert
 * @date 2020/5/6 - 6:22 下午
 */
public class MapHeap {
    public static void main(String[] args) {
        int[] data = {12,34,66,4,32,2,456,6,4,232};
        BinaryHeap<Integer> heap = new BinaryHeap<Integer>();
        for (int i = 0; i < data.length; i++) {
            heap.add(data[i]);
        }
    }
}
