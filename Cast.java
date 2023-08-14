class Cast {
    public static void main(String[] args) {
        int way = Integer.parseInt(args[0]);
        int price = Integer.parseInt(args[1]);
        int discount, amount;

        if(way == 1 && price >= 3000){
            double rate = 0.10;  //消費税率10％
            discount = 300;
            amount = (int)((price - discount) * (1 + rate));
            System.out.println("お持ち帰りの税込金額：" + amount + "円");
        } else if(price >= 3000) {
            double rate = 0.08;  //消費税率8％ 
            discount = 300;
            amount = (int)((price - discount)  * (1 + rate));
            System.out.println("店内飲食の税込金額：" + amount + "円");
        } else {
             double rate = 0.08;  //消費税率8％ 
            discount = 0;
            amount = (int)((price - discount)  * (1 + rate));
            System.out.println("店内飲食の税込金額：" + amount + "円");
        }
    }
}
