class Loop3 {
    public static void main(String args[]){
        int[] score = {80, 30, 90};
        String[] name = {"佐藤","近藤","斎藤"};

        for(int i = 0; i < score.length; i++){
            System.out.println(name[i] + "さん：" + score[i] + "点");
        }
        System.out.println("受験者数：" + name.length + "名");
    }
}
