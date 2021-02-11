package algo.lecture.unionfind;

import java.util.Arrays;

public class QuickUnion {
    private int[] d;

    public QuickUnion(int n) {
        d = new int[n];
        for(int i = 0; i < n ; i++){
            d[i] = i;
        }
    }

    public boolean isConnected(int p, int q){
        return parent(p) == parent(q);
    }

    public void union(int p, int q){
        int pParent = parent(p);
        int qParent = parent(q);
        d[qParent] = pParent;
    }

    public int parent(int child){
        if(d[child] == child) return child;
        return parent(d[child]);
    }

    public void printArray(){
        System.out.println(Arrays.toString(d));
    }

    public static void main(String[] args) {
        QuickUnion qf = new QuickUnion(10);
        qf.printArray();
    }
}
