class Student{
    String name = "sato";

    public void caluclateAVG(int math, int english) {
        System.out.println((math + english)/2);
    }
}

public class Lesson13{
    public static void main(String[] args){
        Student a001 = new Student(); //インスタンス化
        a001.name = "tanaka";
        int math = 90;
        int english = 80;

        System.out.println(a001.name);
        a001.caluclateAVG(math, english);
    }
}