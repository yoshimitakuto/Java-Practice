class Practice4 {
    public static void main(String[] args){
        int[] number = new int[20];
        number[0] = 0;
        String str0 = "";  // 偶数入れる
        String str1 = "";  // 奇数入れる
        for(int i = 1; i < number.length; i++){
            number[i] = number[i - 1] + 5;
            System.out.println(number[i]);
            int x = number[i];
            int mod = x % 2;
            str1 += i < 10 && mod == 1 ? x + "," : "";
            str0 += i > 11 && mod == 0 ? x + "," : "";
        }
        System.out.print("偶数 : " + str0.substring(0, str0.length() - 1) + "\n");
        System.out.print("奇数 : " + str1.substring(0, str1.length() - 1) + "\n");
    }
}
