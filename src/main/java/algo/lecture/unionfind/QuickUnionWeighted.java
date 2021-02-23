package algo.lecture.unionfind;

import java.util.Arrays;

public class QuickUnionWeighted {
    private int[] d;
    private int[] sz;

    public QuickUnionWeighted(int n) {
        d = new int[n];
        sz = new int[n];
        for(int i = 0; i < n ; i++){
            d[i]  = i;
            sz[i] = 1;
        }
    }

    public boolean isConnected(int p, int q){
        return parent(p) == parent(q);
    }

    public void union(int p, int q){
        int pParent = parent(p);
        int qParent = parent(q);

        if(sz[pParent] > sz[qParent]){
            d[qParent] = pParent;
            sz[pParent] += sz[qParent];
        }
        else{
            d[pParent] = qParent;
            sz[qParent] += sz[pParent];
        }
    }

    public int parent(int child){
        if(d[child] == child) return child;
        return parent(d[child]);
    }

    public String printArray(){
        return Arrays.toString(d);
    }

    public static void main(String[] args) {
        QuickUnionWeighted qf = new QuickUnionWeighted(10);
        qf.printArray();
    }
}
