class Greeting{
    public static void main(String args[]){
        System.out.println("good morning");
        System.out.println("good afternoon");
        System.out.println("good morning");

        String line = "============================";


        // 整数型
        System.out.println(line);

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
        System.out.println(line);

        double var01 = 1.23456789;
        float var02 = 1.234F;

        System.out.println(var01);
        System.out.println(var02);


        // 文字
        System.out.println(line);

        char var03 = 'A';
        String var04 = "ABCDE";

        System.out.println(var03);
        System.out.println(var04);


        // ブール型
        System.out.println(line);

        int var_1 = 10;
        int var_2 = 1;
        boolean var_bool;
        
        var_bool = (var_1 > var_2);

        System.out.println(var_bool);


        // 配列
        System.out.println(line);

        int[] arr;
        arr = new int[3];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr.length + "要素数");

        String[] atr = {"sato", "kato", "yoshimi"};

        System.out.println(atr[0]);
        System.out.println(atr[1]);
        System.out.println(atr[2]);


        // 多次元配列書き方 part1
        System.out.println(line);

        int[][] allScore = new int[2][3];
        allScore[0][0] = 80;
        allScore[0][1] = 70;
        allScore[0][2] = 60;
        allScore[1][0] = 50;
        allScore[1][1] = 40;
        allScore[1][2] = 30;
        System.out.println(allScore[0][0]);
        System.out.println(allScore[0][1]);
        System.out.println(allScore[0][2]);
        System.out.println(allScore[1][0]);
        System.out.println(allScore[1][1]);
        System.out.println(allScore[1][2]);
        System.out.println(allScore.length);
        System.out.println(allScore[0].length);
        
        // 多次元配列書き方 part2
        String[][] atr_02 = {{"sato", "tanaka"},{"suzuki","takahasi"}};
        System.out.println(atr_02[0][0]);
        System.out.println(atr_02[0][1]);
        System.out.println(atr_02[1][0]);
        System.out.println(atr_02[1][1]);


        // 演算子・関係演算子
        System.out.println(line);
        
        int var_3 = 10;
        int var_4 = 1;
        int var_5 = 10;

        System.out.println(var_3 > var_4);
        System.out.println(var_3 < var_4);
        System.out.println(var_3 >= var_4);
        System.out.println(var_3 <= var_4);
        System.out.println(var_3 <= var_5);
        System.out.println(var_3 + var_4);
        System.out.println(var_3 - var_4);
        System.out.println(var_3 * var_4);
        System.out.println(var_3 / var_4);
        System.out.println(var_3 % var_4);
        System.out.println(var_3 == var_5);
        System.out.println(var_3 != var_4);


        // 論理演算子
        System.out.println(line);

        int x = 8;
        int y = 5;

        System.out.println(x >= 5 && x <= 10);
        System.out.println(y >= 5 && y <= 10);
        System.out.println(x == 3 || y == 3);
        System.out.println(x == 1 || y == 1);


        // 複合代入演算子
        System.out.println(line);
        
        System.out.println(x += 10);

        x++;
        y--;

        System.out.println(x);
        System.out.println(y);


        // 条件分岐
        System.out.println(line);

        if (age >= 20){
            System.out.println("20以上です");
        } else if (age == 20) {
            System.out.println("20未満から1の間です");
        } else {
            System.out.println("それ以外です");
        }


        // 繰り返し
        System.out.println(line);

        for(int i = 0; i <= 4; i++) {
            if(i == 1) {
                continue;
            } else if(i == 3) {
                break;
            } else {
                // 何もしない
            } 
            System.out.println(i);
        }


        for (int r = 0; r <= 2; r++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println(r + "-" + j);
            }
        }

        String name[] = {"吉田","田中","近藤"};
        for (int i = 0; i <= 2; i++) {
            System.out.println(name[i]);
        }

        int var_num[] = {1,2,3,4,5,6};
        int sum = 0;
        for (int i = 0; i <= 5; i++) {
            sum += var_num[i];
        } 

        System.out.println(sum);



        System.out.println(line);

        System.out.println(line);


    }
}