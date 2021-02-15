package geekforgeek.easy.array;

public class FirstNonRepeatingInteger {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 3, 2, 1};

        for(int i = 0; i < data.length; i++){
            boolean isRepeating = false;

            for(int j= i + 1; j < data.length; j++){
                if(data[i] == data[j])    {
                    isRepeating = true;
                }
            }
            if(isRepeating == false){
                System.out.println("First non repeating integer: " + data[i]);
                break;
            }
        }
    }
}
