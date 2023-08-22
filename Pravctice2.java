class Pravctice2 {
    public static void main(String[] args){
        int[] arry = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0; i < arry.length; i++){
            System.out.print(arry[i]);
            if(arry[i] != 10){
                System.out.print(",");
            }
        }


        // 配列を使用しないやり方もある！
        // for(int i = 1; i < 11; i++){
        //     System.out.print(i);
        //     if(i != 10){
        //         System.out.print(",");
        //     }
        // }
    }
}
