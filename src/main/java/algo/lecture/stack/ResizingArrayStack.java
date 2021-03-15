package algo.lecture.stack;

import java.util.Arrays;

public class ResizingArrayStack {
    private String[] data;
    private int totalItems = 0;

    ResizingArrayStack(int initialSize){
        data = new String[initialSize];
    }

    public boolean isEmpty(){
        return totalItems == 0;
    }

    public void push(String value){
        if(totalItems == data.length) resize(totalItems * 2);
        data[totalItems++] = value;
    }

    private void resize(int newSize) {
        String[] newArray = new String[newSize];
        for (int i = 0; i < totalItems; i++){
            newArray[i] = data[i];
        }
        data = newArray;
    }

    public String pop(){
        String value = data[totalItems - 1];
        if(totalItems > 0 && totalItems == data.length / 4 ) resize(data.length / 2);
        data[--totalItems] = null;
        return value;
    }
}
