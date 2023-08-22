import java.util.Arrays;

class Practice {
    public static void main(String[] args){
        int counter = 0;
        int[] arry = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println(i);
                counter++;
            } else {
                // 何もしない
            }
        }

        System.out.println(counter + "個");

        String msg = Arrays.toString(arry);
        System.out.println(msg);

    }
}
