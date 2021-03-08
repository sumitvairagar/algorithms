package algo.lecture.stack;

public class FixedCapcityArrayStack {
    String[] stack;
    int pointer = 0;

    FixedCapcityArrayStack(int capicity){
        stack = new String[capicity];
    }

    public boolean isEmpty(){
        return 0 == pointer;
    }

    public void push(String value){
        stack[pointer++] = value;
    }

    public String pop(){
        String value = stack[pointer - 1];
        stack[--pointer] = null;
        return value;
    }
}
