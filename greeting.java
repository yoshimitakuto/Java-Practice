class Greeting{
    public static void main(String args[]){
        System.out.println("good morning");
        System.out.println("good afternoon");
        System.out.println("good morning");


        // 整数型
        byte var_byte = 1;
        short var_short = 12345;
        int var = 1;
        int age = 20;
        long var_long = 123456789L;

        System.out.println(var_byte);
        System.out.println(var_short);
        System.out.println(var);
        System.out.print(var_long);



        // 少数
        double var01 = 1.23456789;
        float var02 = 1.234F;

        System.out.println(var01);
        System.out.println(var02);


        // 文字
        char var03 = 'A';
        String var04 = "ABCDE";

        System.out.println(var03);
        System.out.println(var04);


        // ブール型
        int var_1 = 10;
        int var_2 = 1;
        boolean var_bool;
        
        var_bool = (var_1 > var_2);

        System.out.println(var_bool);


        // 配列
        int[] arr;
        arr = new int[3];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        String[] atr = {"sato", "kato", "yoshimi"};

        System.out.println(atr[0]);
        System.out.println(atr[1]);
        System.out.println(atr[2]);

        

        

        if (age >= 20){
            System.out.println("20以上です");
        } else if (age == 20) {
            System.out.println("20未満から1の間です");
        } else {
            System.out.println("それ以外です");
        }


    }
}