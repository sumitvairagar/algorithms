package algo.lecture.unionfind;

import java.util.Arrays;

public class QuickFind {
    private int[] d;

    public QuickFind(int n) {
        d = new int[n];
        for(int i = 0; i < n ; i++){
            d[i] = i;
        }
    }

    public boolean isConnected(int p, int q){
        return d[p] == d[q];
    }

    public void union(int p, int q){
        int pid = d[p];
        int qid = d[q];
        for(int i=0; i < d.length; i++){
            if(qid == d[i]) d[i] = pid;
        }
    }

    public String printArray(){
        return Arrays.toString(d);
    }
}
